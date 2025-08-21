package Eliakim.Desafio1;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeNotificacoes {
    private List<Notificacao> notificadores;

    public GerenciadorDeNotificacoes(List<Notificacao> notificadores) {
        this.notificadores = new ArrayList<>(notificadores);
    }

    public void adicionarNotificador(Notificacao notificador){
        this.notificadores.add(notificador);
    }

    public void removerNotificador(Notificacao notificador){
        this.notificadores.remove(notificador);
    }

    public void notificarTodos(String mensagem){
        if (notificadores.isEmpty()) {
            System.out.println(" Nenhum canal de notificação configurado!");
            return;
        }

        System.out.println(" Enviando notificação para" + notificadores.size() + "canal(is)...");
        System.out.println("==".repeat(60));

        for (Notificacao notificador : notificadores) {
            try {
                notificador.enviar(mensagem);
            } catch (Exception e) {
                System.out.println(" Erro ao enviar notificação: " + e.getMessage());

            }
        }

        System.out.println("Notificações enviadas com sucesso!");
        System.out.println("==".repeat(60));
    }

    public int getQuantidadeDeNotificadores(){
        return notificadores.size();
    }
}
