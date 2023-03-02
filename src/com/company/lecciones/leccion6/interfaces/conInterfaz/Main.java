package com.company.lecciones.leccion6.interfaces.conInterfaz;

import com.company.lecciones.leccion6.interfaces.sinInterfaz.Empleado;

public class Main {
    static EmpleadosBD empleadosBD;
    public static void main(String[] args) {
        empleadosBD.listaEmpleados();
        empleadosBD.crear(new Empleado());

    }
}
