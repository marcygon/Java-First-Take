package com.company.leccion1.definiciones.tryAndCatch;

public class TryCatchMain {
    public static void main(String[] args) {
        try {//en try siempre estara el codigo que sospechemos que pueda dar problemas como una base de datos, etc
            int result = 5 / 0;
        } catch (ArithmeticException e){
            e.printStackTrace();//si no se escribe esto no sabriamos si hay algun fallo o no
        } finally {
            System.out.println("Cierre de recursos");//se ejecuta tanto si hay fallo o no
        }



        System.out.println("Fin");//sigue fallando pero el programa continua y lo muestra
    }
}
