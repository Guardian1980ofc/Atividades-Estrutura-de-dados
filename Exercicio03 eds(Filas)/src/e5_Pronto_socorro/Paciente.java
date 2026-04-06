package e5_Pronto_socorro;

public class Paciente implements Comparable<Paciente> {
    private String nome;
    private int prioridade;

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() { return nome; }
    public int getPrioridade() { return prioridade; }

    @Override
    public int compareTo(Paciente outro) {
        // Se a minha prioridade é 1 e a do outro é 3, 1 - 3 = -2 (negativo significa que eu venho antes)
        return Integer.compare(this.prioridade, outro.prioridade);
    }

    @Override
    public String toString() {
        return nome + " (P" + prioridade + ")";
    }
}