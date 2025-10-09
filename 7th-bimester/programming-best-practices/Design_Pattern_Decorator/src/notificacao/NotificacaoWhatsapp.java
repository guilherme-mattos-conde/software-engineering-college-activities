package notificacao;

public class NotificacaoWhatsapp extends NotificacaoDecorator {
    public NotificacaoWhatsapp(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        super.enviarNotificacao(mensagem);
        System.out.println("Notificando por WhatsApp: " + mensagem);
    }
}
