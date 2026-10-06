// 5- Crie uma lista com seis nomes e imprima todos usando um laço, no formato "0: Ana". (Dica: i + ": " + comando para pegar posição da lista)//

import java.util.List;

public class ImprimirLaco {
    public static void main (String[] args){

        List<String> nomes = List.of("Paula", "Mario", "Joana", "Maria", "Carmen", "Cleidson");

        for ( int i = 0; i <nomes.size() ; i++) {
            System.out.println(i + ": " + nomes.get(i));
        }
    }

}