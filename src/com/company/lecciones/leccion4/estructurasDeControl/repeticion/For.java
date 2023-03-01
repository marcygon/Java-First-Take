package com.company.lecciones.leccion4.estructurasDeControl.repeticion;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.println("contador" + i);
        }

        //recorrer un array
        String[] nombres = {"Joji", "Yameii", "Riri"};
        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

        //calcula el doble a traves de un array de numeros
        Integer[] numero = {2, 3, 4};
        for (int i = 0; i < numero.length; i++){
            System.out.println("El doble de " + numero[i] + " es " + numero[i]*2);
        }
    }
}
