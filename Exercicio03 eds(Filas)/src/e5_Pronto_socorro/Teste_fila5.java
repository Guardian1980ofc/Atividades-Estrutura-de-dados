package e5_Pronto_socorro;

public class Teste_fila5 {
    public static void main(String[] args) {
        FilaPrioridade<Paciente> fila = new FilaPrioridade<>(10);

        fila.enfileirar(new Paciente("Zeca", 3));
        fila.enfileirar(new Paciente("Alice", 1));
        fila.enfileirar(new Paciente("Bruno", 2));
        fila.enfileirar(new Paciente("Carla", 1));
        fila.enfileirar(new Paciente("Diana", 3));
        fila.enfileirar(new Paciente("Edu", 2));

        System.out.println("Fila Organizada por Prioridade:");
        System.out.println(fila);

        System.out.println("\n--- Iniciando Atendimento ---");
        while (!fila.esVazio()) {
            System.out.println("Atendendo: " + fila.desenfileirar());
        }
    }
}