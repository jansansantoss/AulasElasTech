
import java.util.Scanner;

public class NotaArray {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = {7.9, 7.0, 6.5, 6.0, 11.0};

        System.out.print("Digite a posição da nota (0 A 4): ");
        int posicao = scanner.nextInt();

        try {
            System.out.println("Nota na posição" + posicao + " : " + notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Erro: Posição inválida O array só vai de 0 a 4.");
        }
    }
}
