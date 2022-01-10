package com.fila;

public class Main {
    public static void main(String[] args) {
        // Instanciando a fila
        Fila<String> fila = new Fila<>();

        // Adicionando novos objetos para a fila
        fila.enqueue("Primeiro");
        fila.enqueue("Segundo");
        fila.enqueue("Terceiro");
        fila.enqueue("Quarto");

        // Imprimindo a fila
        System.out.println(fila);

        // Retirando o primeiro elemento e retornando
        System.out.println(fila.dequeue());

        // Retornando o primeiro da fila
        System.out.println(fila.first());

        // Verificando se a fila está vazia
        System.out.println(fila.isEmpty());
    }
}
