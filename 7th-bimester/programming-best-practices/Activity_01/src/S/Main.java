package S;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Hobbit", "Tolkien");
        RepositorioLivro repositorioLivro = new RepositorioLivro();

        repositorioLivro.salvarLivro(livro);
    }
}
