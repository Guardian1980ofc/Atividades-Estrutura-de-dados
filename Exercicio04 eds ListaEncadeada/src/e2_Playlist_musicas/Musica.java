package e2_Playlist_musicas;

import java.util.Objects;

public class Musica {
    private String titulo;
    private String artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    // Necessário para o método contem() da ListaEncadeada funcionar
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musica musica = (Musica) o;
        return Objects.equals(titulo, musica.titulo) && Objects.equals(artista, musica.artista);
    }

    @Override
    public String toString() {
        return "Música: " + titulo + " | Artista: " + artista;
    }
}
