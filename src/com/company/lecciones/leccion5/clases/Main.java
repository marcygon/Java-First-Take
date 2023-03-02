package com.company.lecciones.leccion5.clases;

import com.company.lecciones.leccion5.herencia.Perfume;

public class Main {
    public static void main(String[] args) {
        //para crear un bjeto se sigue el siguiente esquema
        //Clase inentificador = new Clase();

        //crear un objeto con el constructor vacio
        Colonia alienMuggler = new Colonia();

        //crear un onjeto con el constructor de parametros
        Frasco frascoCristal = new Frasco("cristal", true, 150,"dorado");

        Colonia channelNum5 = new Colonia("Channel num.5","small",2017,true, 0, frascoCristal);
        System.out.println(channelNum5.dose);//dose = 0;
        channelNum5.perfumar(2);
        System.out.println(channelNum5.dose);//al ejecutar el metodo perfumar dose = 2;

        //herencia
        Perfume amorAmor = new Perfume("Amor amor",true,10,7,true,false);

        System.out.println("FIN DE PROGRAMA");

        //polimorfismo

    }
}
