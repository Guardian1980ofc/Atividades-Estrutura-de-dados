package e9_Boletim_notas;

public class TesteBoletim {
    public static void main(String[] args) {
        ListaEncadeada<Disciplina> boletim = new ListaEncadeada<>();

        // 1. Adicionar 5 disciplinas
        boletim.adicionar(new Disciplina("Estrutura de Dados", 9.5));
        boletim.adicionar(new Disciplina("Cálculo I", 7.0));
        boletim.adicionar(new Disciplina("Programação Orientada a Objetos", 8.8));
        boletim.adicionar(new Disciplina("Banco de Dados", 9.0));
        boletim.adicionar(new Disciplina("Sistemas Operacionais", 8.5));

        // 2. Exibir todas as disciplinas com suas notas
        System.out.println("--- Meu Boletim ---");
        System.out.println(boletim);

        // 3. Mostrar qual disciplina está em uma posição específica (ex: posição 0)
        int pos = 0;
        System.out.println("\nDisciplina na posição " + pos + ": " + boletim.pega(pos));

        // 4. Verificar se uma disciplina está cadastrada
        Disciplina busca = new Disciplina("Cálculo I", 0);
        System.out.println("Cálculo I está no boletim? " + (boletim.contem(busca) ? "Sim" : "Não"));

        // 5. Mostrar quantos registros existem
        System.out.println("Total de disciplinas: " + boletim.getTamanho());
    }
}