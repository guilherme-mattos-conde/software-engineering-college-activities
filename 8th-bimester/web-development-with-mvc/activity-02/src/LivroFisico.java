public class LivroFisico extends Livro {
    private int numeroDePaginas;
    private boolean disponivel;

    public LivroFisico(String titulo, Autor autor, Editora editora, int numeroDePaginas, double preco) {
        super(titulo, autor, editora, preco, "Físico");
        this.numeroDePaginas = numeroDePaginas;
        this.disponivel = true;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
