package com.tfi.service;

import com.tfi.model.AutorizacionPago;
import com.tfi.model.PagoTarjeta;

public interface AutorizacionPagoService {

    String solicitarTokenPago(PagoTarjeta pagoTarjeta);
    boolean confirmarPago(String siteTransactionId, String token, double monto);

}
