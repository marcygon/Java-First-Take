package com.company;

public class CocheMain {
    public static void main(String[] args) {
        String coche = "Ferrari";
        Coche cocheObj = new Coche();

        Coche cocheObj2 = new Coche("rosa", "honda", "civic", 1430.75, 5.40);
        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);
        cocheObj2.peso = 1350.80;
        System.out.println(cocheObj2);
    }
}
