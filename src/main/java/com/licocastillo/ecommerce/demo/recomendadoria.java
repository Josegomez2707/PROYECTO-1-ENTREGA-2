package com.licocastillo.ecommerce.demo;

import java.util.ArrayList;
import java.util.List;

public class recomendadoria {
    private int idRecomendador;
    private usuario usuario;
    private List<producto> productosRecomendados;

    // Constructor
    public recomendadoria(int idRecomendador, usuario usuario, List<producto> productosRecomendados) {
        this.idRecomendador = idRecomendador;
        this.usuario = usuario;
        this.productosRecomendados = productosRecomendados;
    }

    // Getters y Setters
    public int getIdRecomendador() {
        return idRecomendador;
    }

    public void setIdRecomendador(int idRecomendador) {
        this.idRecomendador = idRecomendador;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    public List<producto> getProductosRecomendados() {
        return productosRecomendados;
    }

    public void setProductosRecomendados(List<producto> productosRecomendados) {
        this.productosRecomendados = productosRecomendados;
    }

    // Método para obtener detalles de recomendaciones
    public List<String> mostrarRecomendaciones() {
        List<String> detalles = new ArrayList<>();
        for (producto producto : productosRecomendados) {
            detalles.add(producto.obtenerDetalles());
        }
        return detalles;
    }
}
