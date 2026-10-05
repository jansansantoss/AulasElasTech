
//5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a ArithmeticException para o caso de ela digitar 0.//

import java.util.Scanner;

public class numeroPessoa {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            System.out.println("O resto da divisão de 100 por " + numero + " é: " + (100 % numero));
        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero!");
        }
    }
}

