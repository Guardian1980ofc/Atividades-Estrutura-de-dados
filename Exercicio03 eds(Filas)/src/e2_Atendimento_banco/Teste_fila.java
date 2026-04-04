package e2_Atendimento_banco;

import e2_Atendimento_banco.Fila;

public class Teste_fila {
    static void main(String[] args) {

        Cliente c1 = new Cliente("Gilberto", 101);
        Cliente c2 = new Cliente("Eliza", 102);
        Cliente c3 = new Cliente("Alexandre", 103);
        Cliente c4 = new Cliente("Alecio", 104);
        Cliente c5 = new Cliente("Nicolas", 105);
        Cliente c6 = new Cliente("Edoardo", 106);

        Fila<Cliente> fila = new Fila<>(6);
         fila.enfileirar(c1);
         fila.enfileirar(c2);
         fila.enfileirar(c3);
         fila.enfileirar(c4);
         fila.enfileirar(c5);
         fila.enfileirar(c6);

        System.out.println(fila);

        while (!fila.esVazio()){
            Cliente c = fila.desenfileirar();
            System.out.println("Chamando senha: " + c.getNumeroDaSenha());
            System.out.println("Cliente: " + c);
        }
        System.out.println("A fila está vazia");

    }
}
