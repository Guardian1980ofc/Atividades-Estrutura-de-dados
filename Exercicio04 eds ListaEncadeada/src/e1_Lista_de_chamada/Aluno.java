package e1_Lista_de_chamada;

public class Aluno {

    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String toString(){
        return "Nome: " + this.nome + "\nMatricula: " + this.matricula;
    }
}
