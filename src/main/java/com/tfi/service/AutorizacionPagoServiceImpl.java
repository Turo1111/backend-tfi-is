package com.tfi.service;

import com.tfi.model.PagoTarjeta;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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

        HttpEntity<PagoTarjeta> entity = new HttpEntity<>(pagoTarjeta, headers);
        ResponseEntity<Map> response = restTemplate.exchange("https://developers.decidir.com/api/v2/tokens", HttpMethod.POST, entity, Map.class);

        if (response.getStatusCode() == HttpStatus.CREATED) {
            Map<String, Object> responseBody = response.getBody();
            if (responseBody != null && responseBody.containsKey("id")) {
                return (String) responseBody.get("id");
            }
        }

        return null;
    }

    public boolean confirmarPago(String siteTransactionId, String token, double monto) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("apikey", apiKeyPayment);

        Map<String, Object> subPayment = new HashMap<>();
        subPayment.put("site_id", "");
        subPayment.put("amount", monto);
        subPayment.put("installments", null);

        List<Map<String, Object>> subPayments = new ArrayList<>();
        subPayments.add(subPayment);

        Map<String, Object> request = new HashMap<>();
        request.put("site_transaction_id", siteTransactionId);
        request.put("payment_method_id", 1);
        request.put("token", token);
        request.put("bin", "450799");
        request.put("amount", monto);
        request.put("currency", "ARS");
        request.put("installments", 1);
        request.put("description", "");
        request.put("payment_type", "single");
        request.put("establishment_name", "single");
        request.put("sub_payments", subPayments);

        System.out.println("Request: " + request);

        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(request, headers);
        ResponseEntity<Map> response = restTemplate.exchange("https://developers.decidir.com/api/v2/payments", HttpMethod.POST, entity, Map.class);

        System.out.println("Response: " + response);

        if (response.getStatusCode() == HttpStatus.CREATED) {
            Map<String, Object> responseBody = response.getBody();
            if (responseBody != null && responseBody.containsKey("status")) {
                String status = (String) responseBody.get("status");
                return "approved".equalsIgnoreCase(status);
            }
        }

        return false;
    }

}
