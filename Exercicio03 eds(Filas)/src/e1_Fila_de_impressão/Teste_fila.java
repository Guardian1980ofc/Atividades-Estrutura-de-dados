package e1_Fila_de_impressão;

public class Teste_fila {
    public static void main(String[] args) {

        Fila<Documento> fila = new Fila<>(5);

        Documento doc1 = new Documento("Nome de pessoas", 10);
        Documento doc2 = new Documento("Provas aplicadas", 35);
        Documento doc3 = new Documento("Trabalhos execultados", 23);
        Documento doc4 = new Documento("Textos da corporação", 276);
        Documento doc5 = new Documento("Transações", 110);

        fila.enfileirar(doc1);
        fila.enfileirar(doc2);
        fila.enfileirar(doc3);
        fila.enfileirar(doc4);
        fila.enfileirar(doc5);

        System.out.println(fila);

        while(!fila.esVazio()){
            Documento doc = fila.desenfileirar();
            System.out.println("Imprimindo: " + doc);
        }
    }
}
