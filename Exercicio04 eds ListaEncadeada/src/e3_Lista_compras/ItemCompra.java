package e3_Lista_compras;

import java.util.Objects;

public class ItemCompra {
    private String nome;
    private int quantidade;

    public ItemCompra(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemCompra that = (ItemCompra) o;
        return Objects.equals(nome, that.nome); // Compara apenas pelo nome do produto
    }

    @Override
    public String toString() {
        return nome + " (Qtde: " + quantidade + ")";
    }
}