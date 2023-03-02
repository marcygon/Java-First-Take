package com.company.lecciones.leccion6.interfaces.sinInterfaz;

import java.util.ArrayList;
import java.util.List;

/**
 * Create
 * Retrive/Read
 * Update
 * Delete
 */
public class EmpleadosBD {
    //estructura de datos
    private List<Empleado> listaEmpleados = new ArrayList<>();

    //Create
    public void crear(Empleado empleado){
        listaEmpleados.add(empleado);
    }
    //Read
    public List<Empleado> verLista(){
        return listaEmpleados;
    }

    /*
    public void leer(Empleado empleado){
        listaEmpleados.get(empleado);
    }
    //Update

    public void actualizar(Empleado empleado){
        listaEmpleados.sort(empleado);
    }
    //Delete
    public void eliminar(Empleado empleado){
        listaEmpleados.remove(empleado);
    }*/
}
