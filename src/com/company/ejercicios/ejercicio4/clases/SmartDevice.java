package com.company.ejercicios.ejercicio4.clases;

public class SmartDevice {
    protected boolean wifi;
    protected int duracionBateria;
    protected int pulgadas;

    public SmartDevice(){}

    public SmartDevice(boolean wifi, int duracionBateria, int pulgadas) {
        this.wifi = wifi;
        this.duracionBateria = duracionBateria;
        this.pulgadas = pulgadas;
    }
}
