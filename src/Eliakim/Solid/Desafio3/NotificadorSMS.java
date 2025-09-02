package Eliakim.Solid.Desafio3;

class NotificadorSMS implements NotificadorCliente {
    @Override
    public void notificarCliente(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}
