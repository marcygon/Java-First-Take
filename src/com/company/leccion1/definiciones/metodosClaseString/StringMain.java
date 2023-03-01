package com.company.leccion1.definiciones.metodosClaseString;

public class StringMain {
    public static void main(String[] args) {
        /**
         * length()
         * startWith("")
         * endsWith("")
         * indexOf("")
         * subString(1,5)
         * trim()
         * equals()
         * compareTo
         */

        //al utilizar '' estas indicado que el tipo de datoses un char (un caracter)
        //al utilizar "" estas indicando que el tipo de dato es un string

        String mensaje = "Ey world";
        String mensaje2 = "ey world";

        System.out.println(mensaje.length());
        System.out.println(mensaje.startsWith("e"));//sensible a mayus y minus
        System.out.println(mensaje.endsWith("d"));//sensible a mayus y minus
        System.out.println(mensaje.trim());//quita los espacios que puedan haber delante o detras del string

        //para ver si dos strings son iguales
        if(mensaje.equalsIgnoreCase(mensaje2)){//para tener en cuenta las mayus .equals() y sin tener en cuenta .equalsIgnoreCase()
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");
        }

    }
}
