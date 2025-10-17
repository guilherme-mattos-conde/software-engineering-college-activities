import java.util.List;
import java.util.stream.Collectors;

public class CatalogoService implements ICatalogoService {
    private final ICatalogoRepository catalogo;

    public CatalogoService(ICatalogoRepository catalogo) {
        this.catalogo = catalogo;
    }

    public void adicionarLivro(Livro livro) {
        catalogo.getLivros().add(livro);
    }

    public void removerLivro(Livro livro) {
        catalogo.getLivros().remove(livro);
    }

    public List<Livro> getLivrosPorAutor(Autor autor) {
        return catalogo.getLivros().stream()
                .filter(livro -> livro.getAutor().equals(autor))
                .toList();
    }

    public List<Livro> getLivrosPorEditora(Editora editora) {
        return catalogo.getLivros().stream()
                .filter(livro -> livro.getEditora().equals(editora))
                .toList();
    }

    public List<LivroFisico> getLivrosFisicos() {
        return catalogo.getLivros().stream()
                .filter(livro -> livro instanceof LivroFisico)
                .map(livro -> (LivroFisico) livro)
                .toList();
    }

    public List<Ebook> getEbooks() {
        return catalogo.getLivros().stream()
                .filter(livro -> livro instanceof Ebook)
                .map(livro -> (Ebook) livro)
                .toList();
    }

    public List<LivroFisico> getLivrosFisicosDisponiveis() {
        return getLivrosFisicos().stream()
                .filter(LivroFisico::isDisponivel)
                .toList();
    }
}
