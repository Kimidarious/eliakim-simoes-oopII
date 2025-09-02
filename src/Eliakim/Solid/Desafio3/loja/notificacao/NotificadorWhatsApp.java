package Eliakim.Solid.Desafio3.loja.notificacao;

import Eliakim.Solid.Desafio3.loja.interfaces.NotificadorCliente;

public class NotificadorWhatsApp implements NotificadorCliente {
    @Override
    public void notificarCliente(String mensagem) {
        System.out.println("Ehatsapp enviado: " + mensagem);
    }
}
