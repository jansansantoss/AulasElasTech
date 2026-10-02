package org.example;

public class AlgunsSegundos {
    static void main(String[] args) {
        int segundos = 3785;

        int minutos = segundos / 60;
        int sobra = segundos % 60;

        System.out.println("Minutos inteiros: " + minutos);
        System.out.println("Segundos sobram: " + sobra);
    }
}
