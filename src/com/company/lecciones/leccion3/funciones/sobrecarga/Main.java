package com.company.lecciones.leccion3.funciones.sobrecarga;

/**
 * La sobrecarga de funciones permite dulicar un método siempre y cuando tengan diferente nuemero/tipo de parametros
 */
public class Main {
    public static void main(String[] args) {
        String result1 = String.valueOf(suma(2, 3));
        String result2 = String.valueOf(suma(1, 1, 1));
        String result3 = String.valueOf(suma(3.5d, 2.99d));

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
    static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }
    static int suma(int numero1, int numero2, int numero3){ //cambia el numero de parametros
        return numero1 + numero2 + numero3;
    }
    static double suma(double numero1, double numero2){ //cambia el tipo de parametros
        return numero1 + numero2;
    }
}
