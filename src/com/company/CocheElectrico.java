package com.company;

public class CocheElectrico extends Coche{
    String motorElectrico;

    public void cocheElectrico(){
    }
    public void cocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, double peso, double largo, String motorElectrico){
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", motorElectrico='" + motorElectrico + '\'' +
                '}';
    }
}
