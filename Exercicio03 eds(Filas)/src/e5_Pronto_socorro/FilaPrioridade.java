package e5_Pronto_socorro;

public class FilaPrioridade<T> {
    private T[] elementos;
    private int tamanho;

    public FilaPrioridade(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public void enfileirar(T elemento) {
        // O elemento PRECISA implementar Comparable para a prioridade funcionar
        Comparable<T> chave = (Comparable<T>) elemento;

        int i;
        // Percorre o array de trás para frente, "empurrando" quem tem prioridade menor (número maior)
        for (i = this.tamanho - 1; i >= 0; i--) {
            if (chave.compareTo(this.elementos[i]) < 0) {
                this.elementos[i + 1] = this.elementos[i];
            } else {
                break;
            }
        }
        this.elementos[i + 1] = elemento;
        this.tamanho++;
    }

    public T desenfileirar() {
        if (this.esVazio()) return null;

        T elemento = elementos[0];
        // traz todos os elementos para a frente
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return elemento;
    }

    public boolean esVazio() {
        return this.tamanho == 0;
    }

    public int tamanho() {
        return this.tamanho;
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