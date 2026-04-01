public class Pilha {
    private String[] elementos;
    private int tamanho;

    public Pilha(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void empilha(String elemento) {
        if (tamanho == elementos.length) {
            throw new RuntimeException("Pilha cheia!");
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public String desempilha() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia!");
        }
        String topo = elementos[tamanho - 1];
        elementos[tamanho - 1] = null;
        tamanho--;
        return topo;
    }

    public String topo() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia!");
        }
        return elementos[tamanho - 1];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);
            if (i < tamanho - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
