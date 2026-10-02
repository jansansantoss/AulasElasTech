package org.example;

import java.util.Scanner;

public class MaiorDeIdade {

    // Método que recebe a idade e devolve true se for maior de idade
    public static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (ehMaiorDeIdade(idade)) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }

        sc.close();
    }
}