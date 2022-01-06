package com.fila;

public class Main {
    public static void main(String[] args) {
        No no1 = new No("no1");
        No no2 = new No("no2");
        No no3 = new No("no3");

        Fila fila = new Fila();
        fila.enqueue(no1);
        fila.enqueue(no2);
        fila.enqueue(no3);

        System.out.println(fila);
    }
}
