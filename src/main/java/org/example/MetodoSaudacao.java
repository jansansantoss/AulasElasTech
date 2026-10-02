package org.example;


public class MetodoSaudacao {

    public static void saudacao() {
        System.out.println("Olá!");
    }

    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    static void main(String[] args) {
        saudacao();
        saudacao("Maria");
    }
}