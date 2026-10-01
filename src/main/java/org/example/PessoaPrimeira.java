package org.example;

// 3 — Peça o nome da pessoa e mostre a primeira letra dele.//


import java.util.Scanner;


class PessoaPrimeira {

    public static void main(String[] args) {



        Scanner scanner = new Scanner (System.in);



        System.out.print("Digite seu nome: ");

        String nome = scanner.nextLine();

        System.out.println("A primeira letra é: " + nome.charAt(0));

    }

}
