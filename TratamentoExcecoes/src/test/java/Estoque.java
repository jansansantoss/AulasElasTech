
//4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.//
//Use getOrDefault para mostrar a quantidade de um produto que existe//
//e de um que não existe (devolvendo 0). Depois tente com get normal//
//no que não existe e compare.//

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("Feijão", 20);
        estoque.put("Arroz", 6);

        System.out.println("Estoque: " + estoque);

        System.out.println("Arroz (getOrDefault): " + estoque.getOrDefault("Arroz", 0));

        System.out.println("Farinha (getOrDefault): " + estoque.getOrDefault("Farinha", 0));

        System.out.println("Farinha (get): " + estoque.get("Farinha"));
    }
}