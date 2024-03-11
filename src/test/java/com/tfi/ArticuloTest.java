package com.tfi;

import com.tfi.controllers.ArticuloController;
import com.tfi.model.Articulo;
import io.cucumber.junit.Cucumber;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ArticuloTest {

    @Autowired
    private ArticuloController articuloController;

    @Test
    public void testGetArticuloByCodigo_ArticuloExistente() {
        // Configuración del test
        String codigo = "1";

        // Ejecución del método a testear
        Optional<Articulo> result = articuloController.getArticuloByCodigo(codigo);

        // Verificación de resultados
        assertNotNull(result);
        assertTrue(result.isPresent());
        assertEquals(codigo, result.get().getCodigo());
    }

    @Test
    public void testGetArticuloByCodigo_ArticuloNoExistente() {
        // Configuración del test
        String codigo = "456";

        // Ejecución del método a testear
        Optional<Articulo> result = articuloController.getArticuloByCodigo(codigo);

        // Verificación de resultados
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}
