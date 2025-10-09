package notificacao;

public class Main {
    public static void main(String[] args) {
        Notificacao notificacao = new NotificacaoWhatsapp(
                new NotificacaoSMS(
                        new NotificacaoEmail(
                                new NotificacaoSimples()
                        )
                )
        );

        notificacao.enviarNotificacao("O seu pedido foi confirmado!");
    }
}
