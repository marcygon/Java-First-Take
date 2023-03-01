package com.company.lecciones.leccion1.definiciones.refactoring.extractMethod;

public class Good {
    void printHTML(){
        printHead();
        printBody();
        printFooter();
    }
    private void printFooter(){
        System.out.println("<footer>2021 Cosmic developments with love</footer>");
        System.out.println("script");
        System.out.println("copyroght");
        System.out.println("");
    }
    private void printBody(){

    }
    private void printHead(){

    }
}
