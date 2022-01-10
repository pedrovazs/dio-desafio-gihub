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

    // Retorna o conteúdo do objeto
    public T get(int index) {
        return getNo(index).getObject();
    }

    // Remove um elemento passando o índice
    public T remove(int index) {
        // Variável que aponta para o nó
        No<T> noPivor = this.getNo(index);
        // Valida se o índice passado é o 0
        if (index == 0) {
            // Se for, então a referência de entrada vai apontar para o próximo no da variável pivor
            refEntrada = noPivor.getProximoNo();
            return noPivor.getObject();
        }
        // Se o índice for maior do que 0, então cria uma variável com o valor do índice anterior do
        // pivor
        No<T> noAnterior = this.getNo(index - 1);
        // E o faz apontar para o próximo índice do pivor, retirando sua referência na lista.
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getObject();
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
        String strRetorno = "";
        No<T> noAuxliar = refEntrada;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{Objeto= " + noAuxliar.getObject() + "}] -> ";
            noAuxliar = noAuxliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }

    // Pego um nó de acordo com o índice passado
    private No<T> getNo(int index) {
        // Testa se o índice passado é maior que o tamanho da lista
        validaIndex(index);
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

    // Valida se o indice é maior do que a lista.
    private void validaIndex(int index) {
        // Testa se o índice passado é maior que o tamanho da lista
        if (index >= this.size()) {
            // Se for, lança um erro
            throw new IndexOutOfBoundsException("Índice Inexistente: " + index);
        }
    }
}
