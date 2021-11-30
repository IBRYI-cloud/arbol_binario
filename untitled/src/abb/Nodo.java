package abb;

public class Nodo {
    private Nodo izquierdo;
    private int data;
    private Nodo derecho;

    public Nodo(Nodo izquierdo, int data, Nodo derecho) {
        this.setIzquierdo(izquierdo);
        this.setData(data);
        this.setDerecho(derecho);
    }


    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
}

