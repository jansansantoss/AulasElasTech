
//5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
//   Remova uma delas e imprima de novo.//

import java.util.HashMap;

public class Alunas {
    static void main(String[] args) {
        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Ariela", 8.5);
        notas.put("Carliane", 8.0);
        notas.put("Carla", 6.5);

        System.out.println("Mapa: " + notas);
        System.out.println("Tamanho: " + notas.size());

        notas.remove("Ariela");

        // Imprime de novo
        System.out.println("Depois de remover:");
        System.out.println("Mapa: " + notas);
        System.out.println("Tamanho: " + notas.size());
    }
}