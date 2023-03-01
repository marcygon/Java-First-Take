package com.company.lecciones.leccion1.definiciones.arrays;

public class ArrayMain {
    public static void main(String[] args) {
        int[] notas = new int[10];//creamos un array vacio con 10 posiciones el cual tiene numeros integros(enteros)
        notas[0] = 8;//modificar los valores del array por su posicion
        System.out.println(notas[0]);//devuelve el 8

        int[] notas2 = {8, 10, 5, 3, 7, 9, 2, 4};//hacemos un array con los valores ya indicados
        for(int i=0; i<notas2.length; i++){//se imprime el array entero
            System.out.println(notas2[i]);
        }
        for(int item:notas2){//foreach se utiliza mucho para recorrer arrays, lo que estamos indicando es que por cada item que se imprima el valor
            System.out.println(item);
        }

        /*
        notas2.binarySearch(notas2, 9);//.binarySearch(array, posicion a buscar)
        notas2.sort(notas2);//sort(array) metodo que nos permite ordenar un array
        */
    }
}
