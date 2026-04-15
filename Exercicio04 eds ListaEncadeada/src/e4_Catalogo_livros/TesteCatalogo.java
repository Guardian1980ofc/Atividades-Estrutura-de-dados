package e4_Catalogo_livros;

public class TesteCatalogo {
    public static void main(String[] args) {
        ListaEncadeada<Livro> catalogo = new ListaEncadeada<>();

        // 1. Cadastrar 5 livros [cite: 60]
        catalogo.adicionar(new Livro("O Alquimista", "Paulo Coelho", 1988));
        catalogo.adicionar(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        catalogo.adicionar(new Livro("1984", "George Orwell", 1949));
        catalogo.adicionar(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943));
        catalogo.adicionar(new Livro("O Hobbit", "J.R.R. Tolkien", 1937));

        // 2. Mostrar todos os livros [cite: 61]
        System.out.println("--- Catálogo Completo ---");
        System.out.println(catalogo);

        // 3. Exibir o primeiro livro cadastrado [cite: 62, 67]
        System.out.println("\nPrimeiro do catálogo:");
        System.out.println(catalogo.pegaPrimeiro());

        // 4. Exibir o último livro cadastrado [cite: 63, 68]
        System.out.println("\nÚltimo do catálogo:");
        System.out.println(catalogo.pegaUltimo());
    }
}