package com.company.lecciones.leccion6.interfaces.conInterfaz;

import com.company.lecciones.leccion6.interfaces.sinInterfaz.Empleado;

import java.util.List;

public interface EmpleadosBD {
    //en las interfaces solo declaran metodos, no se implementan
    //actua como un contrato, dice lo que hay que hacer pero no lo hace. Son como unas normas

    void crear(Empleado empleado);
    List<Empleado> listaEmpleados();
    void eliminar(Empleado empleado);
}
