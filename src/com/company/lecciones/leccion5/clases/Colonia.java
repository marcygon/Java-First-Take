package com.company.lecciones.leccion5.clases;

/**
 * clase padre, clase base o super clase
 */

public class Colonia {
    //atributos
    protected String name;//se le pone protected o public para poder acceder desde la herencia
    protected String size;
    protected int year;
    protected boolean available;
    protected int dose;
    protected Frasco frasco;//una Clase dentro de otra clase para que no haya mucha info en una sola y no sea complejo

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

