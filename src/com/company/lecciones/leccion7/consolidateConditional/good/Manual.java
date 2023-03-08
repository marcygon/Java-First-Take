package com.company.lecciones.leccion7.consolidateConditional.good;

public class Manual {
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    //haciendo un metodo de forma manual
    double calculateExtraSalary(){
        double result = 0;

        if(!esCandidato()){
            return result;
        }
        //calculamos el salario extra


        return result;
    }
    public boolean esCandidato(){
        //agrupar condiciones utilizado && AND y || OR
        boolean estudios = seniority<1 || education<1;
        boolean antiguedad = incidents>10 && certification;
        return estudios || antiguedad;
    }
}
