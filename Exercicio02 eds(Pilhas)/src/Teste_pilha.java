import java.util.Scanner;

public class Teste_pilha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha(10);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Ver topo");
            System.out.println("4 - Ver tamanho");
            System.out.println("5 - Imprimir pilha");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o elemento: ");
                    String elemento = scanner.nextLine();
                    pilha.empilha(elemento);
                    System.out.println("Empilhado: " + elemento);
                    break;
                case 2:
                    System.out.println("Desempilhado: " + pilha.desempilha());
                    break;
                case 3:
                    System.out.println("Topo: " + pilha.topo());
                    break;
                case 4:
                    System.out.println("Tamanho: " + pilha.tamanho());
                    break;
                case 5:
                    System.out.println("Pilha: " + pilha.toString());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
