
//2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,//
//   imprima, e depois faça put de "café" DE NOVO com valor 7.50.//
//   Imprima outra vez e veja o que aconteceu com o tamanho.//

import java.util.HashMap;
import java.util.Map;

public class TestandoProduto {

    public static void main(String[] args) {
        Map<String, Double> produtos = new HashMap<>();


        produtos.put("café", 5.00);
        System.out.println("Antes : " + produtos);
        System.out.println("Tamanho: " + produtos.size());

        produtos.put("Café", 7.50);
        System.out.println("Depois : " + produtos);
        System.out.println("Tamanho: " + produtos.size());

    }
}
