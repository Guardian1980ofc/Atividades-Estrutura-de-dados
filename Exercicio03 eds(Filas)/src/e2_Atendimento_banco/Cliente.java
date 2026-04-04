package e2_Atendimento_banco;

public class Cliente {

    private String nome;
    private int numeroDaSenha;

    public Cliente(String nome, int numeroDaSenha) {
        this.nome = nome;
        this.numeroDaSenha = numeroDaSenha;
    }

    public String toString() {
        return "Nome: " + nome + "|" + " Numero da senha: " + numeroDaSenha;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDaSenha() {
        return numeroDaSenha;
    }
}
