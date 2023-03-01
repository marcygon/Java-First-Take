package com.company.leccion4.estructurasDeControl.condicionales;

public class Switch {
    public static void main(String[] args) {
        String perro = "labrador";

        switch (perro){
            case "labrador":
                System.out.println("Un labrador es una raza de perro grande.");
                break;
            case "chihuahua":
                System.out.println("Un chihuahua es una raza de perro pequeña");
                break;
            default:
                System.out.println("Elige entre labrador o chihuahua");
        }
    }
}
