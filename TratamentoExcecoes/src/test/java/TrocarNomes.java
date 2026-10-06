//3-Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois. //

import java.util.Arrays;

public class TrocarNomes {
    public static void main(String[] args) {
        var n = Arrays.asList("Ronan", "Paula", "Carlos", "Ana");
        System.out.println(n);
        n.set(2, "Eduardo");
        System.out.println(n);
    }
}