package e8_Controle_de_processos;

public class Processo {
    private int id;
    private double tempoExecucao;
    public Processo(int id, double tempoExecucao) {
        this.id = id;
        this.tempoExecucao = tempoExecucao;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Tempo estimado: " + tempoExecucao + "s";
    }
}