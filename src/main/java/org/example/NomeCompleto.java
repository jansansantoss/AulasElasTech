package org.example;

import java.util.Scanner;



public class NomeCompleto {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite o seu nome completo: ");

        String nome = scanner.nextLine();



        System.out.println ("Seu nome tem " + nome.length () + " letras ( contando os espacos).");

    }

}

