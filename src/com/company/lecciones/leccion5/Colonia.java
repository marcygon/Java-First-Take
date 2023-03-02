package com.company.lecciones.leccion5;

public class Colonia {
    //atributos
    String name;
    String size;
    int year;
    boolean available;
    int dose;
    Frasco frasco;//una Clase dentro de otra clase para que no haya mucha info en una sola y no sea complejo

    //constructores
    public Colonia(){

    }
    public Colonia(String name, String size, int year, boolean available, int dose, Frasco frasco) {
        this.name = name;
        this.size = size;
        this.year = year;
        this.available = available;
        this.dose = 0;
        this.frasco = frasco;
    }

    public Colonia(String name, boolean available){
        this.name = name;
        this.available = available;
    }

    //metodos
    public void perfumar(int quantity){
        this.dose += quantity;
    }
}

