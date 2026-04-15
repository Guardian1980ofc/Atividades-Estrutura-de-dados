package e5_Historico_navegacao;

import java.util.Objects;

public class PaginaWeb {
    private String titulo;
    private String url;

    public PaginaWeb(String titulo, String url) {
        this.titulo = titulo;
        this.url = url;
    }

    // Necessário para o contem() verificar pelo endereço do site
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaginaWeb that = (PaginaWeb) o;
        return Objects.equals(url, that.url);
    }

    @Override
    public String toString() {
        return titulo + " (" + url + ")";
    }
}