package com.company.lecciones.leccion7.consolidateConditional.good;

public class Main {
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;


    //Primera forma de hacerlo haciendo el generate extract method
    double calculateExtraSalary(){
        double result = 0;


        Integer x = getInteger();
        if (x != null) return x;

        return result;
    }

    private Integer getInteger() {
        if(seniority<1)
            return 0;
        if(education<1)
            return 0;
        if(incidents>10)
            return 0;
        if(!certification)
            return 0;
        return null;
    }
}
