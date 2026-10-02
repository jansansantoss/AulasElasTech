package org.example;

//1 — Na mesma classe do main, crie um método chamado mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!". Chame ele no main.//


public class MostrarBoasVindas {

    public static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao curso de java.");
    }

    static void main(String[] args) {

        System.out.println(utilidades.dobro(9));
        mostrarBoasVindas();


    }

    public class utilidades {

        public static int dobro(int numero) {

            return numero * 2;
        }
    }
}