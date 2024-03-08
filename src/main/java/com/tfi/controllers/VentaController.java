package com.tfi.controllers;

import com.tfi.model.LineaVenta;
import com.tfi.model.Stock;
import com.tfi.model.Venta;
import com.tfi.model.enums.TipoPago;
import com.tfi.service.AutorizacionPagoService;
import com.tfi.service.StockService;
import com.tfi.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("venta")
@CrossOrigin(origins = "*")
public class VentaController {

    @Autowired
    VentaService ventaService;
    @Autowired
    AutorizacionPagoService autorizacionPagoService;
    @Autowired
    StockService stockService;

    @PostMapping("/save")
    public Object saveVenta(@RequestBody Venta v){
        if (v.getPago() != null && v.getPago().getTipoPago() != null) {
            TipoPago tipoPago = v.getPago().getTipoPago();
            if (tipoPago.equals(TipoPago.TarjetaDebito) || tipoPago.equals(TipoPago.TarjetaCredito)){
                String siteTransactionId = UUID.randomUUID().toString();
                String token = autorizacionPagoService.solicitarTokenPago(v.getPago().getPagoTarjeta());
                if (token != null) {
                    boolean pagoAprobado = autorizacionPagoService.confirmarPago(siteTransactionId, token, v.getPago().getMonto());
                    if (pagoAprobado) {
                        Venta ventaRealizada = ventaService.saveVenta(v);
                        ventaService.savePago(v.getPago());
                        for (LineaVenta lineaVenta : ventaRealizada.getLineaVenta()) {
                            lineaVenta.setVenta(ventaRealizada); // Asigna la venta a la línea de venta
                            ventaService.saveLineaVenta(lineaVenta); // Guarda la línea de venta en la base de datos
                            Stock stock = lineaVenta.getStock();
                            int cantidadVendida = lineaVenta.getCantidad().intValue();
                            stock.setCantidad(stock.getCantidad().intValue() - cantidadVendida);
                            stockService.saveStock(stock);
                        }

                        return "Pago con tarjeta realizado correctamente";
                    } else {
                        return null;
                    }
                } else {
                    return "Error al realizar pago con tarjeta";
                }
            }
        }
        Venta ventaRealizada = ventaService.saveVenta(v);
        ventaService.savePago(v.getPago());
        for (LineaVenta lineaVenta : ventaRealizada.getLineaVenta()) {
            lineaVenta.setVenta(ventaRealizada); // Asigna la venta a la línea de venta
            ventaService.saveLineaVenta(lineaVenta); // Guarda la línea de venta en la base de datos
            Stock stock = lineaVenta.getStock();
            int cantidadVendida = lineaVenta.getCantidad().intValue();
            stock.setCantidad(stock.getCantidad().intValue() - cantidadVendida);
            stockService.saveStock(stock);
        }
        return "Pago con efectivo";
    }

}
