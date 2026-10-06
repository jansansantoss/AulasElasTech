import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscadorNomes {

    public static void main(String[] args) {

        List<String> nomes = List.of("ABel", "Carlos","Amadeu","Diva","Vagner");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String busca = sc.nextLine();

        int pos = nomes.indexOf(busca);

        if (pos != -1) {
            System.out.println(busca + " Está na lista, na posição  " + pos +  ".");
        } else {
            System.out.println(busca +  " NÃO ESTÁ NA LISTA.!");
        }
    }

}