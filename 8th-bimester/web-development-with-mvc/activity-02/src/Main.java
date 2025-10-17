public class Main {
    public static void main(String[] args) {
        Editora editora = new Editora("Editora Brasil");

        Autor autor1 = new Autor("Machado de Assis");
        Autor autor2 = new Autor("Clarice Lispector");

        LivroFisico livro1 = new LivroFisico("Dom Casmurro", autor1, editora, 150, 30.0);
        LivroFisico livro2 = new LivroFisico("Memórias Póstumas de Brás Cubas", autor1, editora, 220, 35.0);
        Ebook livro3 = new Ebook("A Hora da Estrela", autor2, editora, 28.0, 150, "PDF");

        Catalogo catalogo = new Catalogo();
        CatalogoService catalogoService = new CatalogoService(catalogo);

        catalogoService.adicionarLivro(livro1);
        catalogoService.adicionarLivro(livro2);
        catalogoService.adicionarLivro(livro3);

        System.out.println("Livros da editora " + editora.getNome() + ":");
        catalogoService.getLivrosPorEditora(editora).forEach(System.out::println);

        System.out.println("\nLivros do autor " + autor1.getNome() + ":");
        catalogoService.getLivrosPorAutor(autor1).forEach(System.out::println);

        System.out.println("\nLivros físicos:");
        catalogoService.getLivrosFisicos().forEach(System.out::println);

        System.out.println("\nEbooks:");
        catalogoService.getEbooks().forEach(System.out::println);

        System.out.println("\nLivros físicos disponíveis:");
        catalogoService.getLivrosFisicosDisponiveis().forEach(System.out::println);

        EmprestimoService emprestimoService = new EmprestimoService();

        System.out.println();

        System.out.print("Emprestar Dom Casmurro: ");
        emprestimoService.emprestarLivroFisico(livro1);

        System.out.print("Emprestar Dom Casmurro: ");
        emprestimoService.emprestarLivroFisico(livro1);

        System.out.print("Devolver Dom Casmurro: ");
        emprestimoService.devolverLivroFisico(livro1);

        catalogoService.removerLivro(livro1);
        catalogoService.removerLivro(livro2);
        catalogoService.removerLivro(livro3);
    }
}
