package e8_Agenda_contatos;

import java.util.Objects;

public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        // Busca pode ser feita pelo nome
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public String toString() {
        return nome + ": " + telefone;
    }
}