package com.listaEncadeada;

public class ListaEncadeada<T> {
    private No<T> refEntrada;

    public ListaEncadeada() {
        this.refEntrada = null;
    }

    // Adiciona um novo elemento a lista
    public void add(T conteudo) {
        // Cria o objeto no com o conteudo dentro
        No<T> novoConteudo = new No<>(conteudo);
        // Testa se a lista está vazia
        if (this.isEmpty()) {
            // Se for true a referência de entrada se torna o conteúdo passado
            this.refEntrada = novoConteudo;
            return;
        }
        // Se a lista não estiver vazia então a referência de entrada e colocada dentro da
        // variável auxiliar
        No<T> noAuxiliar = refEntrada;
        // A estrutura 'for' percorre toda a lista até chegar no último elemento
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        // Quando chega ao fim usamos o método setProximoNo para colocarmos o elemento no fim da lista.
        noAuxiliar.setProximoNo(novoConteudo);
    }

    // Pego um nó de acordo com o índice passado
    private No<T> getNo(int index) {
        // Testa se o índice passado é maior que o tamanho da lista
        if (index >= this.size()) {
            // Se for, lança um erro
            throw new IndexOutOfBoundsException("Índice Inexistente!");
        }
        // Se não continua...
        // Cria uma variável auxiliar
        No<T> noAuxiliar = refEntrada;
        // Cria uma variável para o retorno
        No<T> noRetorno = null;
        // Percorre a lista até o índice passado
        for (int i = 0; i <= index; i++) {
            // Guarda o valor da variável auxiliar na variável de retorno
            noRetorno = noAuxiliar;
            // Depois pega o próximo da lista
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
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

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "refEntrada=" + refEntrada +
                '}';
    }
}
