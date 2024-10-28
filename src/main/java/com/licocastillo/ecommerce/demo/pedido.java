package com.licocastillo.ecommerce.demo;

public class pedido {
    private int idPedido;
    private String fechaPedido;
    private String estado;
    private float total;
    private usuario usuario;

    // Constructor
    public pedido(int idPedido, String fechaPedido, String estado, usuario usuario) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.estado = estado;
        this.usuario = usuario;
        this.total = 0.0f;
    }

    // Getters y Setters
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    // Métodos adicionales
    public void calcularTotal(float monto) {
        this.total += monto;
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
}
