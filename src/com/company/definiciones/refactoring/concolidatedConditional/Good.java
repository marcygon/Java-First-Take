package com.company.definiciones.refactoring.concolidatedConditional;

public class Good {
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateSalary(){
        double result = 0;
        if(!isEligibleExtraSalary()){
            return result;
        }
        result += 5;
        return result;
    }
    private boolean isEligibleExtraSalary(){
        boolean estudios = seniority<1 || education<1;
        boolean experiencia = incidents>10 || !certification;
        return estudios || experiencia;
    }
}
