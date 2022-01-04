package com.pilhas;

public class Main {
    public static void main(String[] args) {
        // Instanciando os nós e setando o próximo nó
        No<Integer> no1 = new No<>(1);
        No<Integer> no2 = new No<>(2);
        no1.setRefNo(no2);
        No<Integer> no3 = new No<>(3);
        no2.setRefNo(no3);
        No<Integer> no4 = new No<>(4);
        no3.setRefNo(no4);

        // Instanciando a classe Pilha
        Pilha pilha = new Pilha();
        pilha.push(no1);
        pilha.push(no2);
        pilha.push(no3);
        pilha.push(no4);
        System.out.println(pilha.top());

        // Retorna um boolean dizendo se está (true) ou não (false) vazia.
        System.out.println(pilha.isEmpty());

        // Retira e retorna o no4
        System.out.println(pilha.pop());
        System.out.println(pilha.top());
        // Retira e retorna o no3
        System.out.println(pilha.pop());
        System.out.println(pilha.top());
        // Retira e retorna o no2
        System.out.println(pilha.pop());
        System.out.println(pilha.top());
        // Retira e retorna o no1
        System.out.println(pilha.pop());
        System.out.println(pilha.top());

        System.out.println(pilha.isEmpty());
    }
}
