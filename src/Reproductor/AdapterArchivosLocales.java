package Reproductor;
// Adaptador para Archivos Locales
public class AdapterArchivosLocales implements ReproduccionMusica {
    private ArchivosLocales ArchivosLocales;

    public AdapterArchivosLocales(ArchivosLocales ArchivosLocales) {
        this.ArchivosLocales = ArchivosLocales;
    }

    @Override
    public void reproducir() {
        ArchivosLocales.reproducir();
    }

    @Override
    public void detener() {
        ArchivosLocales.detener();
    }
}