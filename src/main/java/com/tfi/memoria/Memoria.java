package com.tfi.memoria;

import com.tfi.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Memoria {

    static ArrayList<Articulo> articulos = new ArrayList();
    static ArrayList<Stock> stocks = new ArrayList();

    static ArrayList<Talle> talles = new ArrayList();
    static ArrayList<Color> colores = new ArrayList();

    public static void AgregarArticulo(Articulo val){
        if(!articulos.contains(val)){
            articulos.add(val);
        }
    }

    public static void AgregarStocks(Stock val){
        if(!stocks.contains(val)){
            stocks.add(val);
        }
    }

    public static void AgregarTalles(Talle val){
        if(!talles.contains(val)){
            talles.add(val);
        }
    }

    public static void AgregarColores(Color val){
        if(!colores.contains(val)){
            colores.add(val);
        }
    }

    public static ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public static ArrayList<Stock> getStocks() {
        return stocks;
    }

    public static ArrayList<Talle> getTalles() {
        return talles;
    }

    public static ArrayList<Color> getColores() {
        return colores;
    }

}
