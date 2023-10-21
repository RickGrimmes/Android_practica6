package com.example.practica666.Models;

public class Propietario {
    public String usuario;

    public String lado;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    public Propietario(String usuario, String lado) {
        this.usuario = usuario;
        this.lado = lado;
    }
}
