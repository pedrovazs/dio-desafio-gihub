package com.fila;

public class Fila {
    private No refEntrada;

    public Fila() {
        this.refEntrada = null;
    }

    public void enqueue(No novoNo) {
        novoNo.setRefNo(refEntrada);
        this.refEntrada = novoNo;
    }

    public No first() {
        if(!isEmpty()) {
            No primeiroNo = refEntrada;
            while(true) {
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return primeiroNo;
        } else {
            return null;
        }
    }

    public No dequeue() {
        if(!isEmpty()) {
            No primeiroNo = refEntrada;
            No noAuxiliar = refEntrada;
            while (true) {
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
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
        No noAuxiliar = refEntrada.getRefNo();
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
