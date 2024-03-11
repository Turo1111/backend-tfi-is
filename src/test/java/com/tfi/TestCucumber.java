package com.tfi;

import com.tfi.controllers.ArticuloController;
import com.tfi.model.Articulo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TestCucumber {

    @Autowired
    private ArticuloController articuloController;

    private Optional<Articulo> articulo;

    @Given("existe un artículo con el código {string} en la base de datos")
    public void existe_un_artículo_con_el_código_en_la_base_de_datos(String codigo) {
        System.out.println("codigo " + codigo);
        articulo = articuloController.getArticuloByCodigo(codigo);
        assertTrue(articulo.isPresent());
    }

    @When("se consulta el artículo con el código {string}")
    public void se_consulta_el_artículo_con_el_código(String codigo) {
        articulo = articuloController.getArticuloByCodigo(codigo);
    }

    @Then("se devuelve el artículo con la información correspondiente")
    public void se_devuelve_el_artículo_con_la_información_correspondiente() {
        // Agrega las verificaciones necesarias aquí
    }
}