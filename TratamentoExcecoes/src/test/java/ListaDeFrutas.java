

//2-Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.//

import java.util.List;

public class ListaDeFrutas {
    public static void main(String[] args) {
        List<String> frutas = List.of("Pera", "Uva", "maça", "SaladaMista");

        System.out.println("Primeira: " + frutas.get(0));
        System.out.println("Última: " + frutas.get(frutas.size() - 1));
        System.out.println("Quantidade: " + frutas.size());
    }
}