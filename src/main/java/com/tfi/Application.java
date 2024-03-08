package com.tfi;

import com.tfi.memoria.Memoria;
import com.tfi.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		/*Categoria tecnologia = new Categoria(1, "Tecnología");
		Categoria ropa = new Categoria(2, "Ropa");
		Categoria comida = new Categoria(3, "Comida");

		Marca marca1 = new Marca(1, "marca1");
		Marca marca2 = new Marca(2, "marca2");
		Marca marca3 = new Marca(3, "marca3");

		TipoTalle tipoTalle1 = new TipoTalle(1, "tipoTalle1");
		TipoTalle tipoTalle2 = new TipoTalle(2, "tipoTalle2");

		Talle talle1 = new Talle(1, "talle1", tipoTalle1);
		Talle talle2 = new Talle(2, "talle2", tipoTalle2);
		Talle talle3 = new Talle(3, "talle3", tipoTalle1);

		Memoria.AgregarTalles(talle1);
		Memoria.AgregarTalles(talle2);
		Memoria.AgregarTalles(talle3);

		Color color1 = new Color(1, "color1");
		Color color2 = new Color(2, "color2");
		Color color3 = new Color(3, "color3");

		Memoria.AgregarColores(color1);
		Memoria.AgregarColores(color2);
		Memoria.AgregarColores(color3);


		Articulo articulo1 = new Articulo("1", "productoPrueba1", 15.00, 5.00, 21.00, tecnologia, marca1, Memoria.getTalles(), Memoria.getColores());
		Articulo articulo2 = new Articulo("2", "productoPrueba2", 25.00, 5.00, 21.00, ropa, marca2, Memoria.getTalles(), Memoria.getColores());
		Articulo articulo3 = new Articulo("3", "productoPrueba3", 35.00, 5.00, 21.00, comida, marca2, Memoria.getTalles(), Memoria.getColores());
		Articulo articulo4 = new Articulo("4", "productoPrueba4", 45.00, 5.00, 21.00, tecnologia, marca1, Memoria.getTalles(), Memoria.getColores());
		Articulo articulo5 = new Articulo("5", "productoPrueba5", 55.00, 5.00, 21.00, comida, marca3, Memoria.getTalles(), Memoria.getColores());

		Memoria.AgregarArticulo(articulo1);
		Memoria.AgregarArticulo(articulo2);
		Memoria.AgregarArticulo(articulo3);
		Memoria.AgregarArticulo(articulo4);
		Memoria.AgregarArticulo(articulo5);

		Stock stock1 = new Stock(1, articulo1, talle1, color3, 999);
		Stock stock2 = new Stock(2, articulo1, talle2, color3, 999);
		Stock stock3 = new Stock(3, articulo1, talle1, color1, 999);
		Stock stock4 = new Stock(4, articulo2, talle3, color2, 999);
		Stock stock5 = new Stock(5, articulo2, talle2, color1, 999);
		Stock stock6 = new Stock(6, articulo2, talle1, color2, 999);
		Stock stock7 = new Stock(7, articulo3, talle3, color1, 999);
		Stock stock8 = new Stock(8, articulo3, talle2, color1, 999);
		Stock stock9 = new Stock(9, articulo3, talle1, color1, 999);
		Stock stock10 = new Stock(10, articulo4, talle2, color2, 999);
		Stock stock11 = new Stock(11, articulo4, talle2, color1, 999);
		Stock stock12 = new Stock(12, articulo4, talle1, color2, 999);
		Stock stock13 = new Stock(13, articulo5, talle3, color3, 999);
		Stock stock14 = new Stock(14, articulo5, talle2, color1, 999);
		Stock stock15 = new Stock(15, articulo5, talle1, color2, 999);

		Memoria.AgregarStocks(stock1);
		Memoria.AgregarStocks(stock2);
		Memoria.AgregarStocks(stock3);
		Memoria.AgregarStocks(stock4);
		Memoria.AgregarStocks(stock5);
		Memoria.AgregarStocks(stock6);
		Memoria.AgregarStocks(stock7);
		Memoria.AgregarStocks(stock8);
		Memoria.AgregarStocks(stock9);
		Memoria.AgregarStocks(stock10);
		Memoria.AgregarStocks(stock11);
		Memoria.AgregarStocks(stock12);
		Memoria.AgregarStocks(stock13);
		Memoria.AgregarStocks(stock14);
		Memoria.AgregarStocks(stock15);*/

	}

}
