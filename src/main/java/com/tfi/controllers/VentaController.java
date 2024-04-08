package com.tfi.controllers;

import com.tfi.model.LineaVenta;
import com.tfi.model.Stock;
import com.tfi.model.Venta;
import com.tfi.model.enums.TipoPago;
import com.tfi.service.AutorizacionPagoService;
import com.tfi.service.ClienteService;
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
    @Autowired
    ClienteService clienteService;

    @PostMapping("/save")
    public Object saveVenta(@RequestBody Venta v){
        //Verificamos que exista pago
        if (v.getPago() != null && v.getPago().getTipoPago() != null) {
            //Tomamos el pago de lo recibido en el body
            TipoPago tipoPago = v.getPago().getTipoPago();
            //Verificamos si es pago con tarjeta
            if (tipoPago.equals(TipoPago.TarjetaDebito) || tipoPago.equals(TipoPago.TarjetaCredito)){
                //Generamos la id de la transaccion
                String siteTransactionId = UUID.randomUUID().toString();
                //Obtenemos el token de la api de autorizacion de pago
                String token = autorizacionPagoService.solicitarTokenPago(v.getPago().getPagoTarjeta());
                //Verificamos si el token existe y no es nulo
                if (token != null) {
                    //Consultamos a la api de autorizacion si se confirma el pago
                    boolean pagoAprobado = autorizacionPagoService.confirmarPago(siteTransactionId, token, v.getPago().getMonto());
                    if (pagoAprobado) {
                        //Guardamos el pago en la bd
                        Venta ventaRealizada = ventaService.saveVenta(v);
                        ventaService.savePago(v.getPago());
                        clienteService.saveCliente(v.getCliente());
                        for (LineaVenta lineaVenta : ventaRealizada.getLineaVenta()) {
                            //Guardamos linea de venta y lo relacionamos con venta
                            lineaVenta.setVenta(ventaRealizada);
                            ventaService.saveLineaVenta(lineaVenta);
                            //Descontamos el stock en la bd
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
        //Si no se realiza el pago con tarjeta entonces guardamos como pago efectivo
        Venta ventaRealizada = ventaService.saveVenta(v);
        ventaService.savePago(v.getPago());
        clienteService.saveCliente(v.getCliente());
        for (LineaVenta lineaVenta : ventaRealizada.getLineaVenta()) {
            lineaVenta.setVenta(ventaRealizada);
            ventaService.saveLineaVenta(lineaVenta);
            Stock stock = lineaVenta.getStock();
            int cantidadVendida = lineaVenta.getCantidad().intValue();
            stock.setCantidad(stock.getCantidad().intValue() - cantidadVendida);
            stockService.saveStock(stock);
        }
        return "Pago con efectivo";
    }

}
