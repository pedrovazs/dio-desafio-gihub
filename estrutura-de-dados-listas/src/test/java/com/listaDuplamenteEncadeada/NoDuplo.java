package com.listaDuplamenteEncadeada;

public class NoDuplo<T> {
    private T objeto;
    private NoDuplo<T> noPosterior;
    private NoDuplo<T> noAnterior;

    public NoDuplo() {
        noPosterior = null;
        noAnterior = null;
    }

    public NoDuplo(T objeto) {
        this.objeto = objeto;
        noPosterior = null;
        noAnterior = null;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public NoDuplo<T> getNoPosterior() {
        return noPosterior;
    }

    public void setNoPosterior(NoDuplo<T> noPosterior) {
        this.noPosterior = noPosterior;
    }

    public NoDuplo<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(NoDuplo<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "objeto=" + objeto +
                '}';
    }
}
