
//2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.//



import java.util.Scanner;

public class notaArray {

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
