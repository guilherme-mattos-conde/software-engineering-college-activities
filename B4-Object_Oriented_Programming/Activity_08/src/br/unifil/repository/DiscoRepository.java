package br.unifil.repository;
import br.unifil.model.Disco;
import java.util.ArrayList;
import java.util.List;

public class DiscoRepository {
    private List<Disco> discos = new ArrayList<>();

    public void adicionarDisco(Disco disco) {
        discos.add(disco);
    }

    public List<Disco> listarDiscos() {
        return discos;
    }

    public void removerDisco(Disco disco) {
        discos.remove(disco);
    }
}
