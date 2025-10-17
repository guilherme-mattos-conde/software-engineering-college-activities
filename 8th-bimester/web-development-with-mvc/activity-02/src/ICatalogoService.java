import java.util.List;

public interface ICatalogoService {
    void adicionarLivro(Livro livro);
    void removerLivro(Livro livro);
    List<Livro> getLivrosPorAutor(Autor autor);
    List<Livro> getLivrosPorEditora(Editora editora);
    List<LivroFisico> getLivrosFisicos();
    List<Ebook> getEbooks();
    List<LivroFisico> getLivrosFisicosDisponiveis();
}
