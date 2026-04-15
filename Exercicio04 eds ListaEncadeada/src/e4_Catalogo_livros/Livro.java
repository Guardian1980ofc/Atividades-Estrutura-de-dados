package e4_Catalogo_livros;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("'%s' - %s (%d)", titulo, autor, ano);
    }
}