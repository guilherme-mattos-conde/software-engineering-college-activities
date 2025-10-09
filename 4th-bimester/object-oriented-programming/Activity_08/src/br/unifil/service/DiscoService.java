package br.unifil.service;
import br.unifil.model.Disco;
import br.unifil.repository.DiscoRepository;
import java.util.List;

public class DiscoService {
    private DiscoRepository discoRepository = new DiscoRepository();

    public void cadastrarDisco(String titulo, int ano, List<String> faixas) {
        Disco disco = new Disco(titulo, ano, faixas);
        discoRepository.adicionarDisco(disco);
    }

    public void editarDisco(Disco disco, String novoTitulo, int novoAno, List<String> novasFaixas) {
        disco.setTitulo(novoTitulo);
        disco.setAnoLancamento(novoAno);
        disco.setFaixas(novasFaixas);
    }

    public void removerDisco(Disco disco) {
        discoRepository.removerDisco(disco);
    }

    public void listarDiscos() {
        discoRepository.listarDiscos().forEach(disco ->
                System.out.println(disco.getTitulo() + " - " + disco.getAnoLancamento() + " - " + disco.getFaixas())
        );
    }

    public Disco buscarDiscoPorTitulo(String titulo) {
        return discoRepository.listarDiscos()
                .stream()
                .filter(disco -> disco.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }

}
