package e3_Lista_compras;

public class TesteCompras {
    public static void main(String[] args) {
        ListaEncadeada<ItemCompra> lista = new ListaEncadeada<>();

        // 1. Adicionar 7 itens [cite: 43]
        lista.adicionar(new ItemCompra("Arroz", 2));
        lista.adicionar(new ItemCompra("Feijão", 3));
        lista.adicionar(new ItemCompra("Macarrão", 1));
        lista.adicionar(new ItemCompra("Leite", 12));
        lista.adicionar(new ItemCompra("Café", 2));
        lista.adicionar(new ItemCompra("Açúcar", 1));
        lista.adicionar(new ItemCompra("Óleo", 2));

        // 2. Exibir todos os itens [cite: 44]
        System.out.println("Lista de Compras: " + lista);

        // 3. Mostrar item em uma posição informada (ex: posição 3) [cite: 45]
        int pos = 3;
        System.out.println("Item na posição " + pos + ": " + lista.pega(pos));

        // 4. Verificar se determinado produto foi adicionado [cite: 46]
        ItemCompra busca = new ItemCompra("Café", 0);
        System.out.println("Café está na lista? " + (lista.contem(busca) ? "Sim" : "Não"));

        // 5. Contar quantos itens cadastrados [cite: 46]
        System.out.println("Total de itens: " + lista.getTamanho());
    }
}