package notificacao;

public abstract class NotificacaoDecorator implements Notificacao {
    protected Notificacao notificacao;

    public NotificacaoDecorator(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        notificacao.enviarNotificacao(mensagem);
    }
}
