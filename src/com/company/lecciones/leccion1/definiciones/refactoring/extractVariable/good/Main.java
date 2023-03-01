package com.company.lecciones.leccion1.definiciones.refactoring.extractVariable.good;

public class Main {
    void printProductPrice(Order order){


        Double quantityPrice = order.getPrice() * order.getQuantity();//precio total de los productos
        Double offerPrice = order.getPrice() * order.getOffer();//descuento
        Double finalPrice = quantityPrice - offerPrice;//precio final = precio total menos el descuento
        Double shippingPrice = order.getShipping() * 2;//calculo envio
        System.out.println(finalPrice + shippingPrice);//precio final
    }
}
