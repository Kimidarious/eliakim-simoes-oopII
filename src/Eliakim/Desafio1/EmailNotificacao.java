package Eliakim.Desafio1;

public class EmailNotificacao implements Notificacao{
    private String enderecoEmail;

    public EmailNotificacao(String enderecoEmail){
        this.enderecoEmail = enderecoEmail;
    }

    public void enviar(String mensagem){
        System.out.println("Enviando email para " + enderecoEmail + ":");
        System.out.println(" Assunto: Notificação do Sistema");
        System.out.println(" Mensagem: " + mensagem);
        System.out.println();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
