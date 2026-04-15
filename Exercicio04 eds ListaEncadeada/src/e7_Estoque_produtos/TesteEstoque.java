package e7_Estoque_produtos;

public class TesteEstoque {
    public static void main(String[] args) {
        ListaEncadeada<Produto> estoque = new ListaEncadeada<>();

        // 1. Adicionar 6 produtos
        estoque.adicionar(new Produto("Notebook", 3500.00, 10));
        estoque.adicionar(new Produto("Mouse Wireless", 120.50, 50));
        estoque.adicionar(new Produto("Teclado Mecânico", 250.00, 30));
        estoque.adicionar(new Produto("Monitor 24'", 900.00, 15));
        estoque.adicionar(new Produto("Headset Gamer", 450.00, 20));
        estoque.adicionar(new Produto("Cadeira Office", 1200.00, 5));

        // 2. Exibir todos os produtos
        System.out.println("--- Estoque Atual ---");
        System.out.println(estoque);

        // 3. Mostrar produto em uma determinada posição (ex: posição 2)
        int pos = 2;
        System.out.println("\nProduto na posição " + pos + ": " + estoque.pega(pos));

        // 4. Verificar se um produto existe no estoque
        Produto busca = new Produto("Monitor 24'", 0, 0);
        System.out.println("Monitor 24' está no estoque? " + (estoque.contem(busca) ? "Sim" : "Não"));

        // 5. Mostrar o primeiro e o último produto cadastrados
        System.out.println("Primeiro produto: " + estoque.pegaPrimeiro());
        System.out.println("Último produto: " + estoque.pegaUltimo());
    }
}