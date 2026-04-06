package e9_Agendamento_tarefas;

public class Tarefa implements Comparable<Tarefa> {
    private String nome;
    private int prioridade; // 1 = Alta, 2 = Média, 3 = Baixa

    public Tarefa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() { return nome; }

    @Override
    public int compareTo(Tarefa outra) {
        // Ordenação ascendente: 1 vem antes de 2
        return Integer.compare(this.prioridade, outra.prioridade);
    }

    @Override
    public String toString() {
        return "[" + nome + " | P" + prioridade + "]";
    }
}