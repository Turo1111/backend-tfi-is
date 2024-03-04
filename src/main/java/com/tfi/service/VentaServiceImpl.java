package com.tfi.service;

import com.tfi.model.Venta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceImpl implements VentaService {

    @Override
    public Venta saveVenta(Venta v) {
        return v;
    }

}
