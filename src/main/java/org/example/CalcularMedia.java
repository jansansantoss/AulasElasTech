package org.example;

import java.util.Scanner;

public class CalcularMedia {

    public static double calcularMedia(double n1, double n2) {

        return (n1 + n2) / 2;
    }

    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a  sua nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a  sua nota: ");
        double nota2 = sc.nextDouble();

        double media = calcularMedia(nota1, nota2);
        System.out.printf("A media eh: %2f%n", media);

    }
}