package e8_Controle_de_processos;

import e3_Fila_de_supermercado.Fila;

public class Teste_fila8 {
    public static void main(String[] args) {
        Fila<Processo> cpu = new Fila<>(10);

        cpu.enfileirar(new Processo(101, 2.5));
        cpu.enfileirar(new Processo(102, 1.8));
        cpu.enfileirar(new Processo(103, 4.0));
        cpu.enfileirar(new Processo(104, 0.5));

        System.out.println("--- Escalonador de Processos ---");
        System.out.println("Processos aguardando: " + cpu);
        System.out.println("--------------------------------\n");

        while (!cpu.esVazio()) {
            // No momento que desenfileiramos, ele entra "em execução"
            Processo emExecucao = cpu.desenfileirar();

            System.out.println("CPU STATUS: Executando processo #" + emExecucao.getId());
            System.out.println("Aguarde... finalizando tarefa.");

            // Simulação de término
            System.out.println("Processo #" + emExecucao.getId() + " concluído e removido da fila.");
            System.out.println("--------------------------------");
        }

        System.out.println("CPU ociosa. Todos os processos foram finalizados.");
    }
}