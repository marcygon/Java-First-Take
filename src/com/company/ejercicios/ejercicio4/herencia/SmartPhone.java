package com.company.ejercicios.ejercicio4.herencia;

import com.company.ejercicios.ejercicio4.clases.SmartDevice;

public class SmartPhone extends SmartDevice {
    String modelo;
    String marca;
    String color;

    public SmartPhone(){}
    public SmartPhone(boolean wifi, int duracionBateria, int pulgadas, String modelo, String marca, String color) {
        super(wifi, duracionBateria, pulgadas);
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }
}
