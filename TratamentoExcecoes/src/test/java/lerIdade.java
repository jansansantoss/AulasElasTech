
//3- questão Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número.//


import java.util.InputMismatchException;
import java.util.Scanner;

public class lerIdade {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer idade = null;

        while (idade == null) {
            System.out.print("Digite sua idade: ");
            try {
                idade = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido!");
                sc.next();
            }
        }

        System.out.println("Sua idade é: " + idade);
    }
}