package com.company.definiciones;

public class Funciones {
    public static void main(String[] args) {

        holaMundo("Marcia");

        String hola = devolverHolaMundo();
        System.out.println(hola);
    }

    public static void holaMundo(String name) {
        System.out.println("Hola " + name);
    }

    private static String devolverHolaMundo(){
        return "Hola mundo";
    }

    private static int sum(int num1, int num2){
        return num1 + num2;
    }
}