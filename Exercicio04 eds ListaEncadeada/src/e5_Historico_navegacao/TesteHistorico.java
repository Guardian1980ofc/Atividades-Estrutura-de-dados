package e5_Historico_navegacao;

public class TesteHistorico {
    public static void main(String[] args) {
        ListaEncadeada<PaginaWeb> historico = new ListaEncadeada<>();

        // 1. Adicionar 8 páginas visitadas
        historico.adicionar(new PaginaWeb("Google", "google.com"));
        historico.adicionar(new PaginaWeb("YouTube", "youtube.com"));
        historico.adicionar(new PaginaWeb("GitHub", "github.com"));
        historico.adicionar(new PaginaWeb("Stack Overflow", "stackoverflow.com"));
        historico.adicionar(new PaginaWeb("ChatGPT", "openai.com"));
        historico.adicionar(new PaginaWeb("LinkedIn", "linkedin.com"));
        historico.adicionar(new PaginaWeb("Gmail", "mail.google.com"));
        historico.adicionar(new PaginaWeb("Portal Facul", "faculdade.edu.br"));

        // 2. Mostrar histórico completo
        System.out.println("--- Histórico de Navegação ---");
        System.out.println(historico);

        // 3. Informar se determinada página foi visitada
        PaginaWeb busca = new PaginaWeb("", "github.com");
        System.out.println("\nO site GitHub foi visitado? " + (historico.contem(busca) ? "Sim" : "Não"));

        // 4. Mostrar a última página visitada
        System.out.println("Última página acessada: " + historico.pegaUltimo());

        // 5. Quantidade total
        System.out.println("Total de páginas no histórico: " + historico.getTamanho());
    }
}