package com.company.leccion3.funciones.conParametros;

public class Opcion2 {
    public static void main(String[] args) {
        String mascota = "perro";
        String color = "blanco";
        String miMascota = obtenerMascota(mascota, color);
        System.out.println(miMascota);
    }
    static String obtenerMascota(String mascota, String color){
        return "Mi mascota es un: " + mascota + " de color: " + color;
    }
}
