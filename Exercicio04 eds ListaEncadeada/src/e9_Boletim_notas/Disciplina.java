package e9_Boletim_notas;

import java.util.Objects;

public class Disciplina {
    private String nome;
    private double notaFinal;

    public Disciplina(String nome, double notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public String toString() {
        return nome + ": " + notaFinal;
    }
}