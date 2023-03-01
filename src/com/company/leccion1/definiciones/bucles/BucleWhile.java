package com.company.leccion1.definiciones.bucles;

public class BucleWhile {
    public static void main(String[] args) {
        int count = 0;

        while(count < 10){
            count++;//condicion
            if(count == 6)
                break;//rompe el flujo de ejecucioon (rompe el buble)
                //continue; //salta el valor 6 y continua a la siguiente iteracion

            System.out.println("Soy un bucle while y me he repetido " + count + " veces");

        }
        System.out.println("Fin del bucle");
    }
}
