package e1_Fila_de_impressão;

public class Documento {

    private String nome;
    private int numeroDePaginas;

    public Documento(String nome, int numeroDePaginas) {
        this.nome = nome;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Documento: " + nome + " | Páginas: " + numeroDePaginas;
    }
}
