package com.company.leccion1.definiciones.scanner;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce una edad");
        int edad = scanner.nextInt();

        System.out.println("El nombre introducido es: " + nombre + " y tiene " + edad + " vueltas al sol");
        System.out.println("Fin");
    }
}
