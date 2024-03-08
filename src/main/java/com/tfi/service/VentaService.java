package com.tfi.service;

import com.tfi.model.Articulo;
import com.tfi.model.LineaVenta;
import com.tfi.model.Pago;
import com.tfi.model.Venta;

public interface VentaService {

    Venta saveVenta(Venta venta);

    LineaVenta saveLineaVenta(LineaVenta venta);

    Pago savePago(Pago pago);

}
