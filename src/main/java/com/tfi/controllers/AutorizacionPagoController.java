package com.tfi.controllers;

import com.tfi.model.PagoTarjeta;
import com.tfi.service.AutorizacionPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("authpay")
@CrossOrigin(origins = "*")
public class AutorizacionPagoController {

    @Autowired
    AutorizacionPagoService autorizacionPagoService;

    @PostMapping("/confirm")
    public Object confirmarPago(@RequestBody PagoTarjeta pagoTarjeta){
        String siteTransactionId = UUID.randomUUID().toString();
        String token = autorizacionPagoService.solicitarTokenPago(pagoTarjeta);
        if (token != null) {
            boolean pagoAprobado = autorizacionPagoService.confirmarPago(siteTransactionId, token, 123);
            if (pagoAprobado) {
                return pagoAprobado;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

}
