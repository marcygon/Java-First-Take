package com.company.definiciones.switchDef;

public class Switch {
    public static void main(String[] args) {
        String weather = "rain";

        switch (weather){
            case "snow":
                System.out.println("omg it's snowing");
                break;
            case "rain":
                System.out.println("it's raining, i love it");
                break;
            default:
                System.out.println("weather it's not  identified");
        }
    }
}
