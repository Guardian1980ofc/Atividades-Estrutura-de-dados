package e6_Lista_convidados;

public class TesteConvidados {
    public static void main(String[] args) {
        ListaEncadeada<Convidado> lista = new ListaEncadeada<>();

        // 1. Cadastrar 6 convidados
        lista.adicionar(new Convidado("Edoardo Neto", "111.222.333-44"));
        lista.adicionar(new Convidado("Maria Silva", "222.333.444-55"));
        lista.adicionar(new Convidado("João Souza", "333.444.555-66"));
        lista.adicionar(new Convidado("Ana Costa", "444.555.666-77"));
        lista.adicionar(new Convidado("Carlos Luz", "555.666.777-88"));
        lista.adicionar(new Convidado("Beatriz Reis", "666.777.888-99"));

        // 2. Exibir a lista completa
        System.out.println("--- Lista de Convidados ---");
        System.out.println(lista);

        // 3. Verificar se um convidado específico está cadastrado (pelo CPF)
        Convidado busca = new Convidado("", "111.222.333-44");
        System.out.println("\nO convidado com CPF 111.222.333-44 está na lista? "
                + (lista.contem(busca) ? "Sim" : "Não"));

        // 4. Informar o número total
        System.out.println("Total de convidados: " + lista.getTamanho());
    }
}
