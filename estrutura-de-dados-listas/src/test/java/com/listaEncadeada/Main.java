package com.listaEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        // Adiciona elementos a lista
        lista.add("Primeiro");
        lista.add("Segundo");
        lista.add("Terceiro");
        lista.add("Quarto");

        // Mostra a lista
        System.out.println(lista);

        // Pega um elemento de acordo com o índice passado
        System.out.println(lista.get(2));

        // Remove um elemento e o retorna de acordo com o índice
        System.out.println(lista.remove(1));

        System.out.println(lista);
        // Mostra o tamanho da lista
        System.out.println(lista.size());
        // Verifica se a lista está vazia ou não
        System.out.println(lista.isEmpty());
    }
}
