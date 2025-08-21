package Eliakim.Desafio1;

public class WhatsAppNotificacao implements Notificacao{
    private String numeroWhatsApp;

    public WhatsAppNotificacao(String numeroWhatsApp) {
        this.numeroWhatsApp = numeroWhatsApp;
    }

    @Override
    public void enviar(String mensagem){
        System.out.println(" WhatsApp enviado para: " + numeroWhatsApp + ":");
        System.out.println("  " + mensagem);
        System.out.println();

        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
