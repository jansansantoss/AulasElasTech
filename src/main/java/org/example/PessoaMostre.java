package org.example;

//2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.//



import java.util.Scanner;


public class PessoaMostre {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome : ");

        String nome = scanner.nextLine();

        System.out.println("Maiusculo: " + nome.toUpperCase());

        System.out.println("Minusculo: " + nome.toLowerCase());

    }
}
