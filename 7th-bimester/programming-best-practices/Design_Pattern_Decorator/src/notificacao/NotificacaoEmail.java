package notificacao;

public class NotificacaoEmail extends NotificacaoDecorator {
    public NotificacaoEmail(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        super.enviarNotificacao(mensagem);
        System.out.println("Notificando por Email: " + mensagem);
    }
}
