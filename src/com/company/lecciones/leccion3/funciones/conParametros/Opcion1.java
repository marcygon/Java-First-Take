package com.company.lecciones.leccion3.funciones.conParametros;

public class Opcion1 {
    public static void main(String[] args) {
        saludar("Hola terricola");
        presentacion("Márcia", 23);
    }

    static void saludar(String saludo){
        System.out.println(saludo + " espero que estes teniendo un buen dia.");
    }
    static void presentacion(String nombre, int edad){
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }
}
