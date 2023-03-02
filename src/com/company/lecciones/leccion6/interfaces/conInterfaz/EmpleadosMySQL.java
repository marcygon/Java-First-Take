package com.company.lecciones.leccion6.interfaces.conInterfaz;

import com.company.lecciones.leccion6.interfaces.sinInterfaz.Empleado;

import java.util.List;

public class EmpleadosMySQL implements EmpleadosBD{
    @Override
    public void crear(Empleado empleado) {

    }

    @Override
    public List<Empleado> listaEmpleados() {
        return null;
    }

    @Override
    public void eliminar(Empleado empleado) {

    }
}
