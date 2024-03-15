
package com.tfi.steps;

import com.tfi.controllers.ArticuloController;
import com.tfi.model.Articulo;
import com.tfi.model.Categoria;
import com.tfi.model.Marca;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ArticuloTestCucumber {

    @InjectMocks
    private ArticuloController articuloController;
    private Optional<Articulo> articulo;


    @Given("existe un artículo con el código {string} en la base de datos")
    public void existe_un_artículo_con_el_código_en_la_base_de_datos(String codigo) {
        // Creacion del mock ArticuloController
        articuloController = Mockito.mock(ArticuloController.class);

        Categoria categoria = new Categoria("C001", "Remeras");
        Marca marca = new Marca("M001", "Nike");
        Articulo mockArticulo = new Articulo("1", "Descripción de prueba", 937.69, 20.0, 21.0, categoria, marca);

        // Configurar del comportamiento del mock
        Mockito.when(articuloController.getArticuloByCodigo(codigo)).thenReturn(Optional.of(mockArticulo));

    }

    @When("se consulta el artículo con el código {string}")
    public void se_consulta_el_artículo_con_el_código(String codigo) {
        // Llamar al método del controlador de Artículo con el código
        articulo = articuloController.getArticuloByCodigo(codigo);
    }

    @Then("se devuelve el artículo con la información correspondiente")
    public void se_devuelve_el_artículo_con_la_información_correspondiente() {
        // Verificar que el artículo devuelto no sea nulo y esté presente
        assertNotNull(articulo);
        assertTrue(articulo.isPresent());
    }
}