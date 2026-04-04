package e3_Fila_de_supermercado;

public class Teste_fila {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Maria", 3);
        Cliente c2 = new Cliente("João", 22);
        Cliente c3 = new Cliente("Ana", 7);
        Cliente c4 = new Cliente("Pedro", 15);
        Cliente c5 = new Cliente("Carla", 1);

        Fila<Cliente> fila = new Fila<>(5);

        fila.enfileirar(c1);
        fila.enfileirar(c2);
        fila.enfileirar(c3);
        fila.enfileirar(c4);
        fila.enfileirar(c5);

        while (!fila.esVazio()){
            Cliente c = fila.desenfileirar();
            System.out.println("Cliente: " + c.getNome());
            System.out.println("Clientes restantes: " + fila.tamanho());

        }
    }
}
