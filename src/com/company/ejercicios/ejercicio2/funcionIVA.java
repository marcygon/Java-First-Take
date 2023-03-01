package com.company.ejercicios.ejercicio2;

import java.util.Scanner;

public class funcionIVA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");

        int numero = scanner.nextInt();//el numero que se ha introducido
        double iva = numero * 0.21;
        double suma = numero + iva;

        System.out.println("El resultado con IVA es: " + suma +"€");
    }
}
