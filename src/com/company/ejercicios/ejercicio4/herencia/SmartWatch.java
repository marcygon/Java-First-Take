package com.company.ejercicios.ejercicio4.herencia;

import com.company.ejercicios.ejercicio4.clases.SmartDevice;

public class SmartWatch extends SmartDevice {
    String color;
    boolean microfono;
    boolean cambioCorrea;

    public SmartWatch(){}

    public SmartWatch(boolean wifi, int duracionBateria, int pulgadas, String color, boolean microfono, boolean cambioCorrea) {
        super(wifi, duracionBateria, pulgadas);
        this.color = color;
        this.microfono = microfono;
        this.cambioCorrea = cambioCorrea;
    }
}
