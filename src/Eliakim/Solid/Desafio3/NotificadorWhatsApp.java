package Eliakim.Solid.Desafio3;

class NotificadorWhatsApp implements NotificadorCliente {
    @Override
    public void notificarCliente(String mensagem) {
        System.out.println("Ehatsapp enviado: " + mensagem);
    }
}
