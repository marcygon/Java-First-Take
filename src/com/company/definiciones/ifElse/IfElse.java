package com.company.definiciones.ifElse;

public class IfElse {
    public static void main(String[] args) {
        boolean check = 5 < 10;
        int number1 = 50;
        int number2 = 10;
        int number3 = 20;
        int number4 = 100;

        if (number1 < number2 && number2 < number3)
            System.out.println("Is true");

        else if (number1 < number4)
            System.out.println("Else if is true");
        else System.out.println("False");

        System.out.println("The end");
    }
}
