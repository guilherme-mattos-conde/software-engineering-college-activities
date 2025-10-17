public class Ebook extends Livro {
    private double tamanhoMb;
    private String formatoDoArquivo;

    public Ebook(String titulo, Autor autor, Editora editora, double preco,double tamanhoMb, String formatoDoArquivo) {
        super(titulo, autor, editora, preco, "Ebook");
        this.tamanhoMb = tamanhoMb;
        this.formatoDoArquivo = formatoDoArquivo;
    }

    public double getTamanhoMb() {
        return tamanhoMb;
    }

    public void setTamanhoMb(double tamanhoMb) {
        this.tamanhoMb = tamanhoMb;
    }

    public String getFormatoDoArquivo() {
        return formatoDoArquivo;
    }

    public void setFormatoDoArquivo(String formatoDoArquivo) {
        this.formatoDoArquivo = formatoDoArquivo;
    }
}
