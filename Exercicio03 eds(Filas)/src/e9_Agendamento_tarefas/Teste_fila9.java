package e9_Agendamento_tarefas;

import e5_Pronto_socorro.FilaPrioridade; // Importe sua classe FilaPrioridade

public class Teste_fila9 {
    public static void main(String[] args) {
        FilaPrioridade<Tarefa> agenda = new FilaPrioridade<>(10);

        // Enfileirando várias tarefas
        agenda.enfileirar(new Tarefa("Backup do Sistema", 3));
        agenda.enfileirar(new Tarefa("Atualização de Segurança", 1));
        agenda.enfileirar(new Tarefa("Limpeza de Logs", 2));
        agenda.enfileirar(new Tarefa("Verificação de Disco", 2));

        System.out.println("--- Sistema de Agendamento ---");

        while (!agenda.esVazio()) {
            System.out.println("\nFila atual: " + agenda);

            // Executa a mais prioritária (a primeira da fila)
            Tarefa tarefaExecutada = agenda.desenfileirar();

            System.out.println(">>> EXECUTANDO AGORA: " + tarefaExecutada.getNome());
            System.out.println("Status: Concluída.");
        }

        System.out.println("\nFila final: " + agenda);
        System.out.println("Todas as tarefas do sistema foram processadas.");
    }
}
