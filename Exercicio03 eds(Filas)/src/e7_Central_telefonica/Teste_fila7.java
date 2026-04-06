package e7_Central_telefonica;

import e3_Fila_de_supermercado.Fila; // Importando sua Fila original

public class Teste_fila7 {
    public static void main(String[] args) {
        Fila<Chamada> central = new Fila<>(10);

        central.enfileirar(new Chamada("Carlos", "Dúvida sobre fatura"));
        central.enfileirar(new Chamada("Bárbara", "Suporte técnico"));
        central.enfileirar(new Chamada("Fernando", "Cancelamento de plano"));
        central.enfileirar(new Chamada("Juliana", "Elogio ao atendimento"));

        System.out.println("--- Central Telefônica Iniciada ---");
        System.out.println("Chamadas em espera: " + central.tamanho());
        System.out.println("----------------------------------\n");

        while (!central.esVazio()) {
            // Mostra quantas estão aguardando antes de atender a atual
            System.out.println("Aguardando no sistema: " + central.tamanho());

            // Atende uma por vez
            Chamada atual = central.desenfileirar();

            System.out.println(">>> ATENDENDO AGORA: " + atual.getNomePessoa());
            System.out.println("Assunto: " + atual.getAssunto());
            System.out.println("----------------------------------");
        }

        System.out.println("Todas as chamadas foram encerradas. Fila vazia.");
    }
}