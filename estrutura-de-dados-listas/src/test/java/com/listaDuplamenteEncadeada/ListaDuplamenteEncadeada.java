package com.listaDuplamenteEncadeada;

import com.listaEncadeada.No;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public void add(T objeto) {
        // Cria um novo nó
        NoDuplo<T> novoNo = new NoDuplo<>(objeto);
        // Define o próximo nó como nulo
        novoNo.setNoPosterior(null);
        // Define o nó anterior como sendo o último da lista
        novoNo.setNoAnterior(ultimoNo);
        // Testa se o primeiro nó da lista é nulo e se for define o primeiro nó como sendo o novo
        if(primeiroNo == null) {
            this.primeiroNo = novoNo;
        }
        // Testa se o último nó é diferente de nulo e se for define o seu próximo nó como sendo o
        // novo nó
        if(ultimoNo != null) {
            ultimoNo.setNoPosterior(novoNo);
        }
        // Se o último nó for igual a nulo então o último nó será o novo nó
        ultimoNo = novoNo;
        // No fim aumenta o tamanho da lista em 1;
        tamanhoLista++;
    }

    public void add(int index, T objeto) {
        // Define o noAuxiliar como sendo o nó do índice passado.
        NoDuplo<T> noAuxiliar = this.getNo(index);
        // Cria um novo nó recebendo o objeto passado no parâmetro
        NoDuplo<T> novoNo = new NoDuplo<>(objeto);
        // Define o próximo nó do novoNo sendo o noAuxiliar
        novoNo.setNoPosterior(noAuxiliar);
        // Testa se o próximo nó do novo nó é diferente de nulo
        if (novoNo.getNoPosterior() != null) {
            // Se for então define seu nó anterior com sendo o nó anterior do noAuxiliar
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            // E também pega o próximo nó e define seu nó anterior como o novoNo
            novoNo.getNoPosterior().setNoAnterior(novoNo);
        }else {
            // Se não define o no anterior do novoNo como sendo o ultimoNo
            novoNo.setNoAnterior(ultimoNo);
            // E o ultimoNo recebe novoNo
            ultimoNo = novoNo;
        }
        // Se o index passado for 0
        if (index == 0) {
            // Então define o primeiroNo como sendo o novoNo
            primeiroNo = novoNo;
        }else {
            // Se não pega o nó anterior do novoNo e define seu anterior como novoNo
            novoNo.getNoAnterior().setNoPosterior(novoNo);
        }
        // Aumenta o tamanho da lista em 1
        tamanhoLista++;
    }

    public NoDuplo<T> remove(int index) {
        //TODO
        return null;
    }

    public T get(int index) {
        // Retorna o objeto do getNo
        return this.getNo(index).getObjeto();
    }

    public int size() {
        return tamanhoLista;
    }

    private NoDuplo<T> getNo(int index) {
        // Define o noAuxiliar como sendo o primeiroNo
        NoDuplo<T> noAuxiliar = primeiroNo;
        // A estrutura 'for' procura até o índice recebido e testa se o noAuxiliar é diferente de nulo
        for(int i = 0; (i < index) && (noAuxiliar != null); i++) {
            // Se passar então o noAuxiliar recebe o seu próximo nó
            noAuxiliar = noAuxiliar.getNoPosterior();
        }
        return noAuxiliar;
    }
}
