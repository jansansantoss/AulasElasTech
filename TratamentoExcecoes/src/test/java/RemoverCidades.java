// 4- Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.  //

import java.util.ArrayList;
import java.util.List;

public class RemoverCidades {
    public static void main(String[] args) {
        List<String> cidades = new ArrayList<>(List.of("Ceará", "Recife", "RioGrande", "Maceió"));

        cidades.remove(1);

        System.out.println("Sobraram: " + cidades.size());
    }
}