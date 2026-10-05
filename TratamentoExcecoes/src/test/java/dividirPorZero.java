import java.util.Scanner;

public class DividirPorZero {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int b = scanner.nextInt();


        try {

            int resultado = a / b;
            System.out.println("Resultado: " + a + " / " + b + " = " + resultado);
        } catch (ArithmeticException e) {

            System.out.println("ErroRRRR: não é possível dividir po ZERO!!!");
        }
    }
}
