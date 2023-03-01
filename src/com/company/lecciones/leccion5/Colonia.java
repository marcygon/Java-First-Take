package com.company.lecciones.leccion5;

public class Colonia {
    String name;
    String size;
    int year;
    boolean available;
    int dose;

    public Colonia(){

    }
    public Colonia(String name, String size, int year, boolean available){
        this.name = name;
        this.size = size;
        this.year = year;
        this.available = available;
    }
    public Colonia(String name, boolean available){
        this.name = name;
        this.available = available;
    }

    public void perfumar(int quantity){
        this.dose += quantity;
    }
}

