package com.company.ejercicios.ejercicio4.clases;

import com.company.ejercicios.ejercicio4.herencia.SmartPhone;
import com.company.ejercicios.ejercicio4.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartDevice samsungTv = new SmartDevice();
        SmartDevice panasonicTv = new SmartDevice(true,0,40);

        SmartPhone alcatel = new SmartPhone();
        SmartPhone iphone11 = new SmartPhone(true,24,11,"Iphone 11 pro","Apple","Verde");

        SmartWatch huaweiiWatch = new SmartWatch();
        SmartWatch appleWatch = new SmartWatch(true,30,5,"Blanco", true,true);

        System.out.println("Fin ejercicio");
    }
}
