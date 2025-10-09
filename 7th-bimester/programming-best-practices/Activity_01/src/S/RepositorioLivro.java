package S;

public class RepositorioLivro {
    public void salvarLivro(Livro livro) {
        System.out.println("S.Livro : " + livro.getTitulo() + " (Inserido no Banco de Dados)");
    }
}
