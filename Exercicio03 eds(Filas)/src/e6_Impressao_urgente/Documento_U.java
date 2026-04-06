package e6_Impressao_urgente;

public class Documento_U implements Comparable<Documento_U> {
    private String nome;
    private int paginas;
    private int prioridade; // 1 = Urgente, 2 = Normal, 3 = Baixa

    public Documento_U(String nome, int paginas, int prioridade) {
        this.nome = nome;
        this.paginas = paginas;
        this.prioridade = prioridade;
    }

    public String getNome() { return nome; }

    @Override
    public int compareTo(Documento_U outro) {
        // Comparação padrão: se o meu número de prioridade for menor
        return Integer.compare(this.prioridade, outro.prioridade);
    }

    @Override
    public String toString() {
        return "Documento: " + nome + " | Páginas: " + paginas + " | Prioridade: " + prioridade;
    }
}