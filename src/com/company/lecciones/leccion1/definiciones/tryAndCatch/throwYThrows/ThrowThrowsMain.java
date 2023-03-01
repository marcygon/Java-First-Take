package com.company.lecciones.leccion1.definiciones.tryAndCatch.throwYThrows;

import java.util.Scanner;

public class ThrowThrowsMain {
    public static void main(String[] args) {
        try{
            leerNombres();
        } catch (NameFormatException e){
            e.printStackTrace();
        }
    }

    /**
     * Metodo que lee nombres de consola y verifica que tengan la longitud igual o mayor que 8 caracteres
     * @throws NameFormatException
     */

    private static void leerNombres() throws NameFormatException{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        while (teclado.hasNext()){
            System.out.println("Introduce un nombre");
            String nombre = teclado.nextLine();
            if(nombre.length()<8){
                teclado.close();
                throw new NameFormatException("El nombre debe contener un minimo de 8 carcateres");
            }
        }
        teclado.close();
    }
}
