package com.company.coche;

public class PolimorfismoMain {
    Coche coche1 = new Coche();
    //CocheElectrico coche2 = new CocheElectrico();



    //polimorfismo nos permite heredar el tipo base
    Coche coche3 = new CocheElectrico("rosa","porshe","fx",1500.50,5.80,"TFX");
    /*
    if (coche3 instanceof CocheElectrico){
        System.out.println("Si es un coche electrico");
    }
    */
}
