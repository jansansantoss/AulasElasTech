//4 — Crie uma variável String nome = null; e tente imprimir nome.length(). Trate a NullPointerException e mostre "O nome não foi preenchido."//


public class nomeNaoPreenchido {
    static void main(String[] args) {
        String nome = null;

        try {
            System.out.println("Tamanho do nome: " + nome.length());
        } catch (NullPointerException e) {
            System.out.println("O nome não foi preenchido.");
        }
    }
}