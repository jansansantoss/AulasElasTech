package org.example;


// 4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.//


import java.util.Scanner;


class FrasePalavra {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);



        System.out.print("Digite uma frase : ");

        String frase = scanner.nextLine();



        System.out.print("Digite uma palavra: ");

        String palavra = scanner.nextLine();



        if (frase.contains(palavra)) {



            System.out.println("A palavra \"" + palavra + "\" aparece na frase.");



        } else {



            System.out.println("A palavra \"" + palavra + "\" NAO aparece na frase.");

        }

    }


}
