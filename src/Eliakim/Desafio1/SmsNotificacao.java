package Eliakim.Desafio1;

public class SmsNotificacao implements Notificacao{
    private String numeroTelefone;

    public SmsNotificacao(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando SMS para " + numeroTelefone + ":");
        System.out.println("  " + mensagem);
        System.out.println();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
