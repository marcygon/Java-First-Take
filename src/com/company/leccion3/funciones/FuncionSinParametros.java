package com.company.leccion3.funciones;

import java.util.Scanner;

public class FuncionSinParametros {
    public static void main(String[] args) {
        getMenu();
        getProduct();
    }

    /*PARA DELCARAR UNA FUNCION SE HACE FUERA DEL MAIN Y PARA LLAMARLA SE HACE DENTRO*/
    /*similar a react cuando defines una funcion antes del return y luego la ejecutas dentro del return*/


    static void getMenu(){
        System.out.println("Has accedido al e-commerce de intelliJ, estos son nuestros productos:");
        System.out.println("1. Package");
        System.out.println("2. Class");
    }
    static void getProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona el numero del producto");
        int producto = scanner.nextInt();

        if(producto == 1)
            System.out.println("El producto seleccionado es Package");
        else if (producto == 2)
            System.out.println("El producto seleccionado es Class");
        else {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Por favor seleccione el numero 1 o 2");
            int producto2 = scanner2.nextInt();

            if(producto2 == 1)
                System.out.println("El producto seleccionado es Package");
            else if (producto2 == 2)
                System.out.println("El producto seleccionado es Class");
        }



        System.out.println("Gracias por la compra!");
    }
}
