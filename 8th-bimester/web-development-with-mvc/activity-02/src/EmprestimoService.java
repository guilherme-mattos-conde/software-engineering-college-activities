public class EmprestimoService implements InterfaceLivroFisico {

    public void emprestarLivroFisico(LivroFisico livro) {
        if(livro.isDisponivel()) {
            livro.setDisponivel(false);
            System.out.println("Empréstimo realizado!");
        } else {
            System.out.println("Livro não disponível!");
        }
    }

    public void devolverLivroFisico(LivroFisico livro){
        if(livro.isDisponivel()) {
            System.out.println("Livro não emprestado, devolução interrompida!");
        }
        livro.setDisponivel(true);
        System.out.println("Devolução realizada!");
    }
}
