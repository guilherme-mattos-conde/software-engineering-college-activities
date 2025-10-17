import java.util.ArrayList;
import java.util.List;

public class Catalogo implements ICatalogoRepository {
    private final List<Livro> livros = new ArrayList<>();

    public List<Livro> getLivros() {
        return livros;
    }


}
