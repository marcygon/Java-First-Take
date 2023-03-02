package com.company.lecciones.leccion5;

public class Main {
    public static void main(String[] args) {
        //para crear un bjeto se sigue el siguiente esquema
        //Clase inentificador = new Clase();

        //crear un objeto con el constructor vacio
        Colonia alienMuggler = new Colonia();

        //crear un onjeto con el constructor de parametros
        Colonia channelNum5 = new Colonia("Channel num.5","small",2017,true);
        System.out.println(channelNum5.dose);//dose = 0;
        channelNum5.perfumar(2);
        System.out.println(channelNum5.dose);//al ejecutar el metodo perfumar dose = 2;
    }
}
