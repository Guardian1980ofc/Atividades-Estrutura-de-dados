package e2_Playlist_musicas;

public class TestePlaylist {
    public static void main(String[] args) {
        ListaEncadeada<Musica> playlist = new ListaEncadeada<>();

        // 1. Adicionar 6 músicas
        playlist.adicionar(new Musica("Bohemian Rhapsody", "Queen"));
        playlist.adicionar(new Musica("Imagine", "John Lennon"));
        playlist.adicionar(new Musica("Hotel California", "Eagles"));
        playlist.adicionar(new Musica("Billie Jean", "Michael Jackson"));
        playlist.adicionar(new Musica("Stayin' Alive", "Bee Gees"));
        playlist.adicionar(new Musica("Let It Be", "Beatles"));

        // 2. Exibir playlist completa
        System.out.println("--- Playlist Completa ---");
        System.out.println(playlist);

        // 3. Verificar se uma música específica está na lista
        Musica busca = new Musica("Imagine", "John Lennon");
        System.out.println("\nA música 'Imagine' está na playlist? " + (playlist.contem(busca) ? "Sim" : "Não"));

        // 4. Mostrar total de músicas
        System.out.println("Total de músicas na playlist: " + playlist.getTamanho());
    }
}
