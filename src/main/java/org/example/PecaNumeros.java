package org.example;

import java.util.Scanner;

//4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.//

public class PecaNumeros {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }
        for (int i = 4; i >= 0; i--) System.out.println(n[i]);
    }
}
