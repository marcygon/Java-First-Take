package com.company.lecciones.leccion4.estructurasDeControl.condicionales;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que dia es hoy?");
        String dia = scanner.nextLine();

        /**
         * Anotacion importante, grabatelo a fuego
         * Para hacer comparaciones como para saber si el valor de dia es igual a un string que yo quiera
         * tengo que utilizar el .equals() y definirlo. NO SE UTILIZA == COMO EN JS, los dos = sirven
         * sobretodo para comparar numeros y charts, valores simples.
         *
         * recordatorio: String no es un "string", no te dejes engañar por el nombre
         */

        if (dia.equals("lunes"))
            System.out.println("feliz inicio de semana crack");
        else if (dia.equals("martes"))
            System.out.println("martes con m de mañana lo hago");
        else if (dia.equals("miercoles"))
            System.out.println("siento mucho que estes en el peor dia de la semana");
        else if (dia.equals("jueves"))
            System.out.println("feliz jueves!");
        else if (dia.equals("viernes"))
            System.out.println("se acabó, hora de jugar a la switch");
        else if (dia.equals("sabado"))
            System.out.println("felicidad");
        else if (dia.equals("domingo"))
            System.out.println("tristeza");
        else
            System.out.println("No es valido");
    }
}
