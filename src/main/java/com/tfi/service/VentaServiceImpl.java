package com.tfi.service;

import com.tfi.model.LineaVenta;
import com.tfi.model.Pago;
import com.tfi.model.Venta;
import com.tfi.model.enums.TipoPago;
import com.tfi.repository.LineaVentaRepository;
import com.tfi.repository.PagoRepository;
import com.tfi.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceImpl implements VentaService {

    @Autowired
    VentaRepository ventaRepository;
    @Autowired
    LineaVentaRepository lineaVentaRepository;
    @Autowired
    PagoRepository pagoRepository;

    @Override
    public Venta saveVenta(Venta v) {
        return ventaRepository.save(v);
    }

    @Override
    public LineaVenta saveLineaVenta(LineaVenta lineaVenta){
        return lineaVentaRepository.save(lineaVenta);
    };

    @Override
    public Pago savePago(Pago pago){
        return pagoRepository.save(pago);
    };

}
