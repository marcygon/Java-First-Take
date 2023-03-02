package com.company.lecciones.leccion5.clases;

import com.company.lecciones.leccion5.herencia.BodyMilk;
import com.company.lecciones.leccion5.herencia.HandCream;
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
        Colonia colonia;
        colonia = new BodyMilk();
        colonia.perfumar(7);

        colonia = new HandCream();
        colonia.perfumar(3);

        /**
         * clase abstracta: no se puede instanciar(crear objeto), solo instancian las clases hijas
         *
         * la clase abstracta se coloca en la super clase, por ejemplo en mi caso es Colonia. Lo que pasa
         * es que no me dejara crear objetos de colonia, sino que me obliga a crear objetos de la clase
         * BodyMilk, HandCream o Perfume. Asi se que es cada cosa y no es algo en general como Colonia <3
         */



    }
}
