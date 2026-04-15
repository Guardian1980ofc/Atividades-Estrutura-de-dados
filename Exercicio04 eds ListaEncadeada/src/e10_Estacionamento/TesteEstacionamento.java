package e10_Estacionamento;

public class TesteEstacionamento {
    public static void main(String[] args) {
        ListaEncadeada<Carro> estacionamento = new ListaEncadeada<>();

        // 1. Adicionar 5 carros
        estacionamento.adicionar(new Carro("ABC-1234", "Fusca"));
        estacionamento.adicionar(new Carro("XYZ-5678", "Civic"));
        estacionamento.adicionar(new Carro("KJG-9900", "Uno"));
        estacionamento.adicionar(new Carro("LPO-4455", "Corolla"));
        estacionamento.adicionar(new Carro("QWE-1122", "Onix"));

        // 2. Exibir todos os carros estacionados
        System.out.println("--- Carros no Estacionamento ---");
        System.out.println(estacionamento);

        // 3. Verificar se um carro de placa específica está na lista
        Carro busca = new Carro("KJG-9900", "");
        System.out.println("\nCarro placa KJG-9900 está estacionado? "
                + (estacionamento.contem(busca) ? "Sim" : "Não"));

        // 4. Exibir o primeiro e o último carro estacionados
        System.out.println("Primeiro carro a chegar: " + estacionamento.pegaPrimeiro());
        System.out.println("Último carro a chegar: " + estacionamento.pegaUltimo());
    }
}
