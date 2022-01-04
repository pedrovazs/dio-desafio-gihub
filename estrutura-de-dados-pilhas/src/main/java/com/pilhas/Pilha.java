package com.pilhas;

public class Pilha {

    private No refNoEntrada;

    public Pilha() {
        this.refNoEntrada = null;
    }

    // Adiciona um novo no e coloca sua referência no nó anterior
    public void push(No novoNo) {
        No refAuxiliar = refNoEntrada;
        this.refNoEntrada = novoNo;
        refNoEntrada.setRefNo(refAuxiliar);
    }

    // Retorna o nó que está acima
    public No top() {
        return  refNoEntrada;
    }

    // Retira o último nó colocado e o retorna, depois coloca a referência no nó abaixo dele
    public No pop() {
        if(!isEmpty()) {
            No noPoped = refNoEntrada;
            refNoEntrada = refNoEntrada.getRefNo();
            return noPoped;
        }else {
            return null;
        }
    }

    // Retorna false se não estiver vazia e true se estiver vazia
    public boolean isEmpty() {
        return refNoEntrada == null;
    }
}
