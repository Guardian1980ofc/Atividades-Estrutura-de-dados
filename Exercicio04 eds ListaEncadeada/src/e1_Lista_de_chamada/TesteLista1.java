package e1_Lista_de_chamada;

public class TesteLista1 {
    public static void main(String[] args) {

        ListaEncadeada<Aluno> lista = new ListaEncadeada<>();

        lista.adicionar(new Aluno("Ana Silva", "2024001"));
        lista.adicionar(new Aluno("Carlos Souza", "2024002"));
        lista.adicionar(new Aluno("Maria Oliveira", "2024003"));
        lista.adicionar(new Aluno("João Santos", "2024004"));
        lista.adicionar(new Aluno("Fernanda Lima", "2024005"));

        System.out.println("Lista completa:");
        System.out.println(lista);

        System.out.println("\nPrimeiro aluno:");
        System.out.println(lista.pegaPrimeiro());

        System.out.println("\nÚltimo aluno:");
        System.out.println(lista.pegaUltimo());

        System.out.println("\nTotal de alunos: " + lista.getTamanho());
    }
}
