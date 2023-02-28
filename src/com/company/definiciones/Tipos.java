package com.company.definiciones;

public class Tipos {
    public static void main(String[] args) {
        //tipo identificador = 30;
        //tipo identificador;
        //identificador = 30;

        //enteros
        byte number1 = 1; //capacidad de almacenamiento 1 byte
        short number2 = 2; //capacidad de almacenamiento 2 byte
        int number3 = 3; //capacidad de almacenamiento 4 byte
        long number4 = 4; //capacidad de almacenamiento 8 byte

        /* los mas utilizados son int y long por su capacidad*/

        //punto flotante
        float decimal1 = 4.9f; //lo idoneo es poner una f al final para indicar que es float y que no lo confunda con un double
        double decimal2 = 9.99d; //para indicar que es double se puede poner una d al final, es opcional

        //caracter
        char caracter1 = 'a';//char esta pensado solo para un caracter

        //booleans
        boolean verdadero = true;
        boolean falso = false;

        //cadenas de texto
        String nombre = "Marcia";
        String apellido = "Branco";

        //tipos envoltorio
        Integer numero = null;
        Long numero2 = 2L;

        //lista de palabras reservadas que no podemos utilizar como identificadores
        /* https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html */
    }
}
