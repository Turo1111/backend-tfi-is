package com.tfi.service;

import com.tfi.model.PagoTarjeta;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AutorizacionPagoServiceImpl implements AutorizacionPagoService {

    private final RestTemplate restTemplate;
    private final String apiKeyToken;
    private final String apiKeyPayment;

    public AutorizacionPagoServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.apiKeyToken = "b192e4cb99564b84bf5db5550112adea";
        this.apiKeyPayment = "566f2c897b5e4bfaa0ec2452f5d67f13";
    }

    public String solicitarTokenPago(PagoTarjeta pagoTarjeta) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("apikey", apiKeyToken);

        //Armamos estructura de la consulta
        HttpEntity<PagoTarjeta> entity = new HttpEntity<>(pagoTarjeta, headers);
        //Conseguimos la respuesta de la consulta
        ResponseEntity<Map> response = restTemplate.exchange("https://developers.decidir.com/api/v2/tokens", HttpMethod.POST, entity, Map.class);

        //Verificamos el estado de la consulta
        if (response.getStatusCode() == HttpStatus.CREATED) {
            Map<String, Object> responseBody = response.getBody();
            if (responseBody != null && responseBody.containsKey("id")) {
                //Retornamos el token
                return (String) responseBody.get("id");
            }
        }

        return null;
    }

    public boolean confirmarPago(String siteTransactionId, String token, Double monto) {

        //Lo pasamos a entero porque teniamos error con los decimales
        int montoSinDecimal = monto.intValue();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("apikey", apiKeyPayment);


        //Generamos la estructuras de los objetos para el Request
        Map<String, Object> subPayment = new HashMap<>();
        subPayment.put("site_id", "");
        subPayment.put("amount", montoSinDecimal);
        subPayment.put("installments", null);

        List<Map<String, Object>> subPayments = new ArrayList<>();
        subPayments.add(subPayment);

        Map<String, Object> request = new HashMap<>();
        request.put("site_transaction_id", siteTransactionId);
        request.put("payment_method_id", 1);
        request.put("token", token);
        request.put("bin", "450799");
        request.put("amount", montoSinDecimal);
        request.put("currency", "ARS");
        request.put("installments", 1);
        request.put("description", "");
        request.put("payment_type", "single");
        request.put("establishment_name", "single");
        request.put("sub_payments", subPayments);

        //Armamos estructura de la consulta
        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(request, headers);
        //Conseguimos la respuesta de la consulta
        ResponseEntity<Map> response = restTemplate.exchange("https://developers.decidir.com/api/v2/payments", HttpMethod.POST, entity, Map.class);

        //Verificamos el estado de la consulta
        if (response.getStatusCode() == HttpStatus.CREATED) {
            Map<String, Object> responseBody = response.getBody();
            if (responseBody != null && responseBody.containsKey("status")) {
                //Obtenemos el estado de la respuesta
                String status = (String) responseBody.get("status");
                //Devolvemos el estado de la respuesta
                return "approved".equalsIgnoreCase(status);
            }
        }

        return false;
    }

}
