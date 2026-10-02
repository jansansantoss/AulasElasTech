package org.example;

//2 — Crie um método saudar(String nome) que imprime "Olá, [nome]! Tudo bem?". Chame ele três vezes, passando nomes diferentes.//

public class MetodoSaudar {

    static void saudar(String nome) {

        System.out.println("Ola!! " + nome + " tudo bem!?");


    }

    static void main(String[] args) {

        saudar("Maria");
        saudar("Joao");
        saudar("Carlos");
    }
}

