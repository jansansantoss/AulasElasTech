package org.example;


// 5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.//


        import java.util.Scanner;



class PessoaDuasVezes {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);



        System.out.print("Digite seu nome: ");

        String nome1 = scanner.nextLine();



        System.out.print("Digite de novo: ");

        String nome2 = scanner.nextLine();



        System.out.println("Os nomes sao iguais? " + nome1.equalsIgnoreCase(nome2));


    }

}

