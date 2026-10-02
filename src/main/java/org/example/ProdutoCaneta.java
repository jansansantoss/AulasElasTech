package org.example;

class ProdutoCaneta {
    static void main(String[] args) {
        String nome = "Caneca";
        double preco = 12.50;
        int quantidade = 4;
        double total = preco * quantidade;

        System.out.println("Comprei " + quantidade + " unidades de " + nome + " por R$ " + preco + " cada. Total: R$ " + total);
    }
}
