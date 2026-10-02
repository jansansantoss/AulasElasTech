package org.example;

public class MetodoDobro {

    public static int dobro(int numero) {
        return numero * 2;

    }

    static void main(String[] args) {

        int valor = 8;
        int resultado = dobro(valor);
        System.out.println("O dobro de  " + valor + " é : " + resultado);
    }
}