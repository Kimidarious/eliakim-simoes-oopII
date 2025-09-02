package Eliakim.Solid.Desafio3;

public class NotificadorPush implements NotificadorCliente {
    @Override
    public void notificarCliente(String mensagem) {
        System.out.println("Push Notification: " + mensagem);
    }
}
