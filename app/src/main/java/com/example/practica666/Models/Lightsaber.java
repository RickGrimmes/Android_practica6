package com.example.practica666.Models;

public class Lightsaber extends Arma{

    public String color;
    public String hojas;
    public Propietario propietario;

    public Lightsaber(String color, String hojas, Propietario propietario) {
        this.color = color;
        this.hojas = hojas;
        this.propietario = propietario;
    }

    public String getColor() { return color; }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHojas() { return hojas; }

    public void setHojas(String hojas) { this.hojas = hojas; }

    public Propietario getPropietario() { return propietario; }

    public void setPropietario(Propietario propietario) { this.propietario = propietario; }

}
