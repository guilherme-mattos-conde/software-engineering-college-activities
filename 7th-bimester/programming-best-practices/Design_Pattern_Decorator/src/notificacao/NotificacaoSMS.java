package notificacao;

public class NotificacaoSMS extends NotificacaoDecorator {
    public NotificacaoSMS(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        super.enviarNotificacao(mensagem);
        System.out.println("Notificando por SMS: " + mensagem);
    }
}
