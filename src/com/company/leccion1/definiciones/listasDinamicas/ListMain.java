package com.company.leccion1.definiciones.listasDinamicas;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        //al hacer ctrl y click en List puedes ver toda la documentaion
        List<String> nombres = new ArrayList<>();
        nombres.add("Justin");
        nombres.add("Selena");
        nombres.add("Hailey");
        nombres.add("Jenner");

        System.out.println(nombres);//imprime la lista de array

        /*el foreach imprime cada valor del array*/
        for(String nombre:nombres){
            System.out.println(nombre);
        }
    }
}
