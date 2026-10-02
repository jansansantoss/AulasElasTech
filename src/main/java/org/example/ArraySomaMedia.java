package org.example;

public class ArraySomaMedia {
    static void main(String[] args) {
        int soma = 0;
        for (int nota : new int[]{8, 6, 10, 7, 9}) soma += nota;
        System.out.println("Soma: " + soma + "\nMedia: " + soma / 5.0);
    }
}
