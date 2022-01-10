package com.fila;

public class Fila<T> {
    private No<T> refEntrada;

    public Fila() {
        this.refEntrada = null;
    }

    public void enqueue(T object) {
        No<T> novoNo = new No<>(object);
        novoNo.setRefNo(refEntrada);
        this.refEntrada = novoNo;
    }

    public T first() {
        if(!isEmpty()) {
            No<T> primeiroNo = refEntrada;
            while(true) {
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return primeiroNo.getObject();
        } else {
            return null;
        }
    }

    public T dequeue() {
        if(!isEmpty()) {
            No<T> primeiroNo = refEntrada;
            No<T> noAuxiliar = refEntrada;
            while (true) {
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo.getObject();
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return refEntrada == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = refEntrada;
        if(refEntrada != null) {
            while (true) {
                stringRetorno += "[No{object=" +
                        noAuxiliar.getObject() +
                        "}] -> ";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                }else {
                    stringRetorno += "null";
                    break;
                }
            }
        }else {
            stringRetorno = null;
        }
        return stringRetorno;
    }
}
