package br.unifil.repository;
import br.unifil.model.Artista;
import java.util.ArrayList;
import java.util.List;

public class ArtistaRepository {
    private List<Artista> artistas = new ArrayList<>();

    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
    }

    public List<Artista> listarArtistas() {
        return artistas;
    }

    public void removerArtista(Artista artista) {
        artistas.remove(artista);
    }
}
