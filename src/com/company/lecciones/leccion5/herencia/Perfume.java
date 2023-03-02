package com.company.lecciones.leccion5.herencia;

/**
 * clase hijo, clase derivada o subclase
 */

import com.company.lecciones.leccion5.clases.Colonia;

public class Perfume extends Colonia {
    int horasDuracion;
    int intensidad;
    boolean dulce;
    boolean seco;

    public Perfume(String name, boolean available, int horasDuracion, int intensidad, boolean dulce, boolean seco) {
        super(name, available);
        this.horasDuracion = horasDuracion;
        this.intensidad = intensidad;
        this.dulce = dulce;
        this.seco = seco;
    }
}
