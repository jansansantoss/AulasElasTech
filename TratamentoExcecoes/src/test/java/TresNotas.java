// 6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."//

import java.util.Scanner;
public class TresNotas {
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