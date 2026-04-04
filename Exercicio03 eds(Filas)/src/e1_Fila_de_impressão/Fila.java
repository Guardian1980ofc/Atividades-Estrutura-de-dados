package e1_Fila_de_impressão;

import java.util.Arrays;

public class Fila <T>{
    private T[] elementos;
    private int tamanho;
    private  int inicio;

    public Fila(int capacidade) {
        this.tamanho = 0;
        this.inicio = 0;
        this.elementos = (T[]) new Object[capacidade];

    }

    public void enfileirar(T elemento) {
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;

    }

    public T desenfileirar() {
        T elemento = elementos[inicio];
        inicio++;
        tamanho--;
        return elemento;
    }

    public boolean esVazio() {
        return this.tamanho == 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public T primeiro() {
        return this. elementos[inicio];
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = inicio; i < inicio + tamanho; i++) {
            sb.append(elementos[i]);
            if (i < inicio + tamanho - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

}
