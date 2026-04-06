package e4_Senhas_prioridade;

public class Pessoa {
    private String nome;
    private String tipo; // "normal" ou "prioritaria"

    public Pessoa(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Tipo: " + tipo;
    }
}