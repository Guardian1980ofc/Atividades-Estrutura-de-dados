package e5_Historico_navegacao;

import e1_Lista_de_chamada.No;

public class ListaEncadeada<T> {

    No<T> primeiro;
    private int tamanho;

    public ListaEncadeada() {
        this.primeiro = null;
        this.tamanho = 0;
    }

    public void adicionar(T valor) {
        No<T> novo = new No<>(valor);
        if (primeiro == null) {
            primeiro = novo;
        }else {
            No<T> atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
        tamanho++;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        No<T> atual = primeiro;
        while (atual != null) {
            sb.append(atual.getValor());
            if (atual.getProximo() != null) sb.append(", ");
            atual = atual.getProximo();
        }
        sb.append("]");
        return sb.toString();
    }

    public T pegaPrimeiro() {
        return primeiro.getValor();
    }

    public T pegaUltimo() {
        No<T> atual = primeiro;
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }
        return atual.getValor();
    }

    public boolean contem(T valor) {
        No<T> atual = primeiro;
        while (atual != null) {
            if (atual.getValor().equals(valor)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    public T pega(int indice){
        No<T> atual = primeiro;
        for (int i = 0; i < indice; i++){
            atual = atual.getProximo();
        }
        return atual.getValor();
    }
}
