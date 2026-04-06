package e7_Central_telefonica;

public class Chamada {
    private String nomePessoa;
    private String assunto;

    public Chamada(String nomePessoa, String assunto) {
        this.nomePessoa = nomePessoa;
        this.assunto = assunto;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public String getAssunto() {
        return assunto;
    }

    @Override
    public String toString() {
        return "Cliente: " + nomePessoa + " | Assunto: " + assunto;
    }
}