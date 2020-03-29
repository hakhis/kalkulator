package com.kodilla.kalkulator;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("It's alive!");
        System.out.println(calculator.add(3, 2));
        System.out.println(calculator.subtract(9, 5));
    }
}
