package notificacao;

public class NotificacaoSimples implements Notificacao {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Notificação: " + mensagem);
    }
}
