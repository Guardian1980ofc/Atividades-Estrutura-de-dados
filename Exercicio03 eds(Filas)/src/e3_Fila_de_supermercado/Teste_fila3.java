package e3_Fila_de_supermercado;

public class Teste_fila3 {
    public static void main(String[] args) {

        Cliente_S c1 = new Cliente_S("Maria", 3);
        Cliente_S c2 = new Cliente_S("João", 22);
        Cliente_S c3 = new Cliente_S("Ana", 7);
        Cliente_S c4 = new Cliente_S("Pedro", 15);
        Cliente_S c5 = new Cliente_S("Carla", 1);

        Fila<Cliente_S> fila = new Fila<>(5);

        fila.enfileirar(c1);
        fila.enfileirar(c2);
        fila.enfileirar(c3);
        fila.enfileirar(c4);
        fila.enfileirar(c5);

        while (!fila.esVazio()){
            Cliente_S c = fila.desenfileirar();
            System.out.println("Cliente: " + c.getNome());
            System.out.println("Clientes restantes: " + fila.tamanho());

        }
    }
}
