package com.licocastillo.ecommerce.demo;

public class usuario {
    private int idUsuario;
    private String nombre;
    private String email;
    private String password;
    private String direccion;
    private String tipoUsuario;

    // Constructor
    public usuario(int idUsuario, String nombre, String email, String password, String direccion, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.direccion = direccion;
        this.tipoUsuario = tipoUsuario;
    }

    // Getters y Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    // Métodos adicionales
    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public void actualizarDatos(String nombre, String email, String direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }
}
