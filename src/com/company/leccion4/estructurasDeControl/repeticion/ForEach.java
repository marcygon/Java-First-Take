package com.company.leccion4.estructurasDeControl.repeticion;

public class ForEach {
    public static void main(String[] args) {
        String[] ingredientes = {"queso", "tomate", "cebolla", "oregano", "york", "atun"};
        for (String ingredient : ingredientes){
            System.out.println(ingredient);
        }
    }
}
