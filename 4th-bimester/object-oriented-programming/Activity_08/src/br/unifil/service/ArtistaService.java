package br.unifil.service;
import br.unifil.model.Artista;
import br.unifil.model.Disco;
import br.unifil.repository.ArtistaRepository;

public class ArtistaService {
    private ArtistaRepository artistaRepository = new ArtistaRepository();

    public void cadastrarArtista(String nome, String generoMusical, Disco disco) {
        Artista artista = new Artista(nome, generoMusical);
        artistaRepository.adicionarArtista(artista);
        disco.setArtista(artista);
    }

    public void listarArtistas() {
        artistaRepository.listarArtistas().forEach(artista ->
                System.out.println(artista.getNome() + " - " + artista.getGeneroMusical())
        );
    }

    public void removerArtista(Artista artista) {
        artistaRepository.removerArtista(artista);
    }
}
