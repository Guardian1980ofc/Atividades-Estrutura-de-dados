package e6_Impressao_urgente;

public class Teste_fila6 {
    public static void main(String[] args) {
        FilaPrioridade<Documento_U> fila = new FilaPrioridade<>(10);

        fila.enfileirar(new Documento_U("Relatório Mensal", 20, 2));
        fila.enfileirar(new Documento_U("Memorando", 2, 3));
        fila.enfileirar(new Documento_U("CONTRATO SOCIAL", 15, 1)); // Mais urgente
        fila.enfileirar(new Documento_U("Folha de Ponto", 50, 2));

        System.out.println("--- Fila de Impressão Organizada ---");
        System.out.println(fila);
        System.out.println("------------------------------------\n");

        while (!fila.esVazio()) {
            Documento_U doc = fila.desenfileirar();
            System.out.println("Imprimindo: " + doc.getNome());
        }
    }
}