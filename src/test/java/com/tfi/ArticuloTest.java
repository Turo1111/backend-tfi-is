package com.tfi;

import com.tfi.controllers.ArticuloController;
import com.tfi.model.Articulo;
import com.tfi.model.Categoria;
import com.tfi.model.Marca;
import io.cucumber.junit.Cucumber;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ArticuloTest {

    @InjectMocks
    private ArticuloController articuloController;
    private Optional<Articulo> articulo;

    @Test
    public void testGetArticuloByCodigo_PrecioVenta() {
        // Configuración del test
        String codigo = "1";
        Double esperado = 1361.53;

        articuloController = Mockito.mock(ArticuloController.class);

        Categoria categoria = new Categoria("C001", "Remeras");
        Marca marca = new Marca("M001", "Nike");
        Articulo mockArticulo = new Articulo("1", "Descripción de prueba", 937.69, 20.0, 21.0, categoria, marca);

        // Configurar del comportamiento del mock
        Mockito.when(articuloController.getArticuloByCodigo(codigo)).thenReturn(Optional.of(mockArticulo));

        articulo = articuloController.getArticuloByCodigo(codigo);

        // Verificación de resultados
        assertNotNull(articulo);
        assertTrue(articulo.isPresent());
        assertEquals(esperado, articulo.get().getPrecioVenta());
    }

    @Test
    public void testGetArticuloByCodigo_ArticuloNoExistente() {
        // Configuración del test
        String codigo = "231";

        articuloController = Mockito.mock(ArticuloController.class);

        // Configurar del comportamiento del mock
        Mockito.when(articuloController.getArticuloByCodigo(codigo)).thenReturn(null);


        articulo = articuloController.getArticuloByCodigo(codigo);

        // Verificación de resultados
        assertNull(articulo);
    }

    @Test
    public void testGetArticuloByCodigo_ArticuloExistente() {
        // Configuración del test
        String codigo = "1";

        articuloController = Mockito.mock(ArticuloController.class);

        Categoria categoria = new Categoria("C001", "Remeras");
        Marca marca = new Marca("M001", "Nike");
        Articulo mockArticulo = new Articulo("1", "Descripción de prueba", 937.69, 20.0, 21.0, categoria, marca);

        // Configurar del comportamiento del mock
        Mockito.when(articuloController.getArticuloByCodigo(codigo)).thenReturn(Optional.of(mockArticulo));

        articulo = articuloController.getArticuloByCodigo(codigo);

        // Verificación de resultados
        assertNotNull(articulo);
        assertTrue(articulo.isPresent());
    }

}
