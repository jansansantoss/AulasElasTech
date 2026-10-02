package org.example;

public class ResultadosDiferentes {
    static void main(String[] args) {
        System.out.println("2 + 2 = " + 2 + 2);   // 2 + 2 = 22
        System.out.println("2 + 2 = " + (2 + 2)); // 2 + 2 = 4

        // Diferença: o Java lê o + da esquerda para a direita.
        // Na 1ª linha, "texto" + 2 já vira concatenação, então o outro 2
        // também é colado como texto (22).
        // Na 2ª, os parênteses forçam a soma 2 + 2 = 4 antes da concatenação.
    }
}
