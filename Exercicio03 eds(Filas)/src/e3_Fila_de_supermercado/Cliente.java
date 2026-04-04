package e3_Fila_de_supermercado;

public class Cliente {

    private String nome;
    private int quantidadeProdutos;

    public Cliente(String nome, int quantidade){
        this.nome = nome;
        this.quantidadeProdutos = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public String toString(){
        return "Nome: " + nome + "|" + " Quantidade de produtos: " + quantidadeProdutos;
    }
}
