package com.company.lecciones.leccion6.interfaces.sinInterfaz;

public class Empleado {
    String nombre;
    int edad;
    double salario;
    boolean activo;

    public Empleado(){}
    public Empleado(String nombre, int edad, double salario, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.activo = activo;
    }

    //toString() es para que cuando se imprima el objeto en consola tenga una referencia y no imprima la referencia en memorio que hace que salga un @ con numeros
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", activo=" + activo +
                '}';
    }
}
