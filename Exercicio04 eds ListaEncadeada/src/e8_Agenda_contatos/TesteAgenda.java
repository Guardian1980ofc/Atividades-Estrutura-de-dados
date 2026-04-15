package e8_Agenda_contatos;

public class TesteAgenda {
    public static void main(String[] args) {
        ListaEncadeada<Contato> agenda = new ListaEncadeada<>();

        // 1. Adicionar 6 contatos
        agenda.adicionar(new Contato("Edoardo", "99999-1111"));
        agenda.adicionar(new Contato("João Silva", "98888-2222"));
        agenda.adicionar(new Contato("Maria Oliveira", "97777-3333"));
        agenda.adicionar(new Contato("Ana Costa", "96666-4444"));
        agenda.adicionar(new Contato("Carlos Souza", "95555-5555"));
        agenda.adicionar(new Contato("Beatriz Reis", "94444-6666"));

        // 2. Exibir todos os contatos
        System.out.println("--- Minha Agenda ---");
        System.out.println(agenda);

        // 3. Verificar se um contato está cadastrado
        Contato busca = new Contato("Edoardo", "");
        System.out.println("\nEdoardo está na agenda? " + (agenda.contem(busca) ? "Sim" : "Não"));

        // 4. Exibir quantos contatos existem
        System.out.println("Total de contatos: " + agenda.getTamanho());
    }
}