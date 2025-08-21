package Eliakim.Desafio1;

public class PushNotificacao implements Notificacao{
    private String dispositivoId;

    public PushNotificacao(String dispositivoId){
        this.dispositivoId = dispositivoId;
    }

    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando push para " + dispositivoId + ":");
        System.out.println(" Mensagem: " + mensagem);
        System.out.println();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
