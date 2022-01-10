package com.fila;

public class No<T> {
    private T object;
    private No<T> refNo;

    public No() {
        this.refNo = null;
    }
    public No(T object) {
        this.object = object;
        this.refNo = null;
    }

    public T getObject() {
        return object;
    }

    public void setObject(Object Object) {
        this.object = object;
    }

    public No<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
