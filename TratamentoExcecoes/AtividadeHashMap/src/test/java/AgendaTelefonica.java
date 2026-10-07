// 3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey//
  // dentro de um if para mostrar o telefone de alguém que está na agenda//
//e de alguém que não está. //

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap<>();

        agenda.put("Kelly", "21 99999-9999");
        agenda.put("Erlan", "74 98888-9999");

        System.out.println("Agenda completa: " + agenda);
        System.out.println("Tamanho da agenda: " + agenda.size());

        String nome1 = "Kelly";
        if (agenda.containsKey(nome1)) {
            System.out.println("Telefone de " + nome1 + ": " + agenda.get(nome1));
        } else {
            System.out.println(nome1 + " não está na agenda.");
        }

        String nome2 = "Carlos";
        if (agenda.containsKey(nome2)) {
            System.out.println("Telefone de " + nome2 + ": " + agenda.get(nome2));
        } else {
            System.out.println(nome2 + " não está na agenda.");
        }
    }
}