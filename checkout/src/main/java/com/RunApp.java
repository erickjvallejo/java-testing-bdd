package com;

import com.calculator.Calculator;
import com.checkout.Checkout;

public class RunApp {

    public static void main(String[] args) {

        /*Calculator*/
        Calculator calculator = new Calculator();

        System.out.println("Suma: " + calculator.add(1, 2));
        System.out.println("Multiplication: " + calculator.multiply(3, 5));
        System.out.println("Resta: " + calculator.subtract(9, 5));

        /*Checkout*/
        Checkout checkout = new Checkout();
        checkout.definePriceProduct("Snack 1", 50);
        checkout.definePriceProduct("Snack 2", 100);

        checkout.addProductToShoppingCar(1, "Snack 1");
        checkout.addProductToShoppingCar(1, "Snack 2");

        System.out.println("El total es de la compra es : " + checkout.getTotal());

    }
}
