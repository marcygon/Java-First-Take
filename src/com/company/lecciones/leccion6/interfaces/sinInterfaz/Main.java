package com.company.lecciones.leccion6.interfaces.sinInterfaz;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadosBD empleadosBD = new EmpleadosBD();

        Empleado justin = new Empleado("Justin Bieber", 29, 5000.d,false);
        Empleado selena = new Empleado("Selena Gomez", 30, 10000.d,true);
        Empleado rm = new Empleado("Kim Nam-joon", 28, 20000.d,true);

        //añadir empleados
        empleadosBD.crear(justin);
        empleadosBD.crear(selena);
        empleadosBD.crear(rm);

        //consultar lista empleados
        List<Empleado>listaEmpleados = empleadosBD.verLista();
        System.out.println(listaEmpleados);
    }
}
