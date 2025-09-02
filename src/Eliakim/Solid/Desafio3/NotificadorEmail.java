package Eliakim.Solid.Desafio3;

class NotificadorEmail implements NotificadorCliente{
    @Override
    public void notificarCliente(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
    }
}
