package e4_Senhas_prioridade;

import e3_Fila_de_supermercado.Fila;

public class Teste_fila4 {
    public static void main(String[] args) {

        Fila<Pessoa> filaNormal = new Fila<>(10);
        Fila<Pessoa> filaPrioritaria = new Fila<>(10);

        filaPrioritaria.enfileirar(new Pessoa("Ana", "prioritaria"));
        filaPrioritaria.enfileirar(new Pessoa("Beto", "prioritaria"));
        filaPrioritaria.enfileirar(new Pessoa("Caio", "prioritaria"));
        filaPrioritaria.enfileirar(new Pessoa("Daniel", "prioritaria"));
        filaPrioritaria.enfileirar(new Pessoa("Eva", "prioritaria"));

        filaNormal.enfileirar(new Pessoa("Jose", "normal"));
        filaNormal.enfileirar(new Pessoa("Maria", "normal"));

        int contPrioridade = 0;

        System.out.println("--- Ordem de Atendimento ---");

        while (!filaNormal.esVazio() || !filaPrioritaria.esVazio()) {

            // Regra: Atender 3 prioritários para 1 normal
            if (!filaPrioritaria.esVazio() && contPrioridade < 3) {
                Pessoa p = filaPrioritaria.desenfileirar();
                System.out.println("Atendendo (P): " + p.getNome());
                contPrioridade++;
            }
            else if (!filaNormal.esVazio()) {
                Pessoa n = filaNormal.desenfileirar();
                System.out.println("Atendendo (N): " + n.getNome());
                contPrioridade = 0; // Reseta o contador para o próximo ciclo de 3
            }
            else if (!filaPrioritaria.esVazio()) {
                // Caso não existam mais pessoas normais, esvazia a prioritária
                Pessoa p = filaPrioritaria.desenfileirar();
                System.out.println("Atendendo (P): " + p.getNome());
            }
        }

        System.out.println("Todos os clientes foram atendidos.");
    }
}