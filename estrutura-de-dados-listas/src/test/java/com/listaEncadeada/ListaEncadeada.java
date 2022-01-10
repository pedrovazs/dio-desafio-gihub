package com.listaEncadeada;

public class ListaEncadeada<T> {
    private No<T> refEntrada;

    public ListaEncadeada() {
        this.refEntrada = null;
    }

    // Mostra o tamanho da lista
    public int size() {
        int total = 0;
        No<T> noAuxiliar = refEntrada;
        while(true) {
            // Testa se a lista está vazia
            if (noAuxiliar != null) {
                total += 1;
                // Testa se a lista chegou ao fim
                if (noAuxiliar.getProximoNo() != null) {
                    noAuxiliar = noAuxiliar.getProximoNo();
                }else {
                    break;
                }
            }else {
                break;
            }
        }
        return total;
    }

    // Mostra se a lista está vazia ou não
    public boolean isEmpty() {
        return refEntrada == null;
    }
}
