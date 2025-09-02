package Eliakim.Solid.Desafio3.loja.notificacao;

import Eliakim.Solid.Desafio3.loja.interfaces.NotificadorCliente;

public class NotificadorPush implements NotificadorCliente {
    @Override
    public void notificarCliente(String mensagem) {
        System.out.println("Push Notification: " + mensagem);
    }
}
