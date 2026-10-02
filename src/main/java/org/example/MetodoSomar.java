package org.example;


public class MetodoSomar {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    static void main(String[] args) {
        System.out.println(somar(2, 3));       // 5
        System.out.println(somar(2, 3, 4));    // 9
        System.out.println(somar(2.5, 3.5));   // 6.0
    }
}