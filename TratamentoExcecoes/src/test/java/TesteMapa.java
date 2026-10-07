//1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa//
//   inteiro e depois use get para mostrar a idade de uma delas.//

import java.util.HashMap;
import java.util.Map;

public class TesteMapa {
    public static void main(String[] args) {

        Map<String, Integer> pessoas = new HashMap<>();

        pessoas.put("Maria", 26);
        pessoas.put("Carlos", 38);
        pessoas.put("Bruno", 23);


        System.out.println("Mapa : " + pessoas);


        System.out.println("Idade de Maria: " + pessoas.get("Maria"));
    }
}