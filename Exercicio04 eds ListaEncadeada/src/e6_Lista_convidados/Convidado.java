package e6_Lista_convidados;

import java.util.Objects;

public class Convidado {
    private String nome;
    private String cpf;

    public Convidado(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // O equals aqui é vital para buscar pelo CPF (que é único)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado that = (Convidado) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public String toString() {
        return nome + " (CPF: " + cpf + ")";
    }
}