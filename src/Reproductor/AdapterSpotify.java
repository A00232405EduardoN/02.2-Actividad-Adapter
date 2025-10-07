package Reproductor;
// Adaptador para Spotify
public class AdapterSpotify implements ReproduccionMusica {
    private Spotify spotify;

    public AdapterSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    @Override
    public void reproducir() {
        spotify.reproducir();
    }

    @Override
    public void detener() {
        spotify.detener();
    }
}

