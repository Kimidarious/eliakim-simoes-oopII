package Eliakim.Desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaNotificacoes {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("SISTEMA DE NOTIFICAÇÕES");
        System.out.println("==".repeat(50));

        List<Notificacao> notificadoresSelecionados = new ArrayList<>();

        configurarCanais(notificadoresSelecionados);

        GerenciadorDeNotificacoes gerenciador = new GerenciadorDeNotificacoes(notificadoresSelecionados);

        menuPrincipal(gerenciador);

        scanner.close();
    }

    private static void configurarCanais(List<Notificacao> notificadores) {
        System.out.println("CONFIGURAÇÃO DOS CANAIS DE NOTIFICAÇÃO");
        System.out.println("-".repeat(45));

        if (perguntarSeDesejaConfigurar("E-mail")) {
            System.out.println("Digite o endereço de e-mail: ");
            String email = scanner.nextLine();
            notificadores.add(new EmailNotificacao(email));
            System.out.println("E-mail configurado");
        }

        if (perguntarSeDesejaConfigurar("SMS")) {
            System.out.println("Digite o numero de telefone: ");
            String telefone = scanner.nextLine();
            notificadores.add(new SmsNotificacao(telefone));
            System.out.println("SMS configurado");
        }

        if (perguntarSeDesejaConfigurar("Push de Notificação")) {
            System.out.println(" Digite o ID do dispositivo: ");
            String dispositivo = scanner.nextLine();
            notificadores.add(new PushNotificacao(dispositivo));
            System.out.println("Push configurado");
        }

        if (perguntarSeDesejaConfigurar("WhatsApp")) {
            System.out.println(" Digite o número do WhatsApp: ");
            String whatsapp = scanner.nextLine();
            notificadores.add(new WhatsAppNotificacao(whatsapp));
            System.out.println("WhatsApp configurado");
        }
        System.out.println("\n Configuração concluída! " + notificadores.size() + " canal(is) ativo(s).");
    }

    private static boolean perguntarSeDesejaConfigurar(String canal) {
        System.out.println("Deseja configurar o " + canal + "? (S/N): ");
        String resposta = scanner.nextLine().trim().toLowerCase();
        return resposta.equals("s");
    }

    private static void menuPrincipal(GerenciadorDeNotificacoes gerenciador) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n MENU PRINCIPAL");
            System.out.println("-".repeat(30));
            System.out.println("1. Enviar Notificação");
            System.out.println("2. Adicionar canal");
            System.out.println("3. Ver status do sistema");
            System.out.println("4. Enviar notificação de Teste");
            System.out.println("5. Sair");
            System.out.println("\nEscolha uma opção: ");

            String opcao = scanner.nextLine().trim();

            switch (opcao) {
                case "1":
                    enviarNotificacao(gerenciador);
                    break;
                case "2":
                    adicionarCanal(gerenciador);
                    break;
                case "3":
                    mostrarStatus(gerenciador);
                    break;
                case "4":
                    enviarTeste(gerenciador);
                    break;
                case "0":
                    continuar = false;
                    System.out.println("Obrigado por usar o Sistema de Notificações!");
                    break;
                default:
                    System.out.println(" Opção inválida! Tente novamente.");
            }
        }
    }

    private static void enviarNotificacao(GerenciadorDeNotificacoes gerenciador) {
        System.out.println("\n ENVIAR NOTIFICAÇÃO");
        System.out.println("-".repeat(25));
        System.out.println("Digite a mensagem: ");
        String mensagem = scanner.nextLine();

        if (!mensagem.trim().isEmpty()) {
            gerenciador.notificarTodos(mensagem);
        } else {
            System.out.println("Mensagem vazia! Tente novamente.");
        }
    }

    private static void adicionarCanal(GerenciadorDeNotificacoes gerenciador) {
        System.out.println("\n ADICIONAR NOVO CANAL");
        System.out.println("-".repeat(28));
        System.out.println("1. E-mail");
        System.out.println("2. SMS");
        System.out.println("3. Push de Notificação");
        System.out.println("4. WhatsApp");
        System.out.println("\nEscolha o canal: ");

        String tipo = scanner.nextLine().trim();

        switch (tipo) {
            case "1":
                System.out.println("Digite o endereço de e-mail: ");
                String email = scanner.nextLine();
                gerenciador.adicionarNotificador(new EmailNotificacao(email));
                System.out.println("E-mail adicionado!");
                break;
            case "2":
                System.out.println("Digite o numero de telefone: ");
                String telefone = scanner.nextLine();
                gerenciador.adicionarNotificador(new SmsNotificacao(telefone));
                System.out.println("SMS adicionado!");
                break;
            case "3":
                System.out.println(" Digite o ID do dispositivo: ");
                String dispositivo = scanner.nextLine();
                gerenciador.adicionarNotificador(new PushNotificacao(dispositivo));
                System.out.println("Push adicionado!");
                break;
            case "4":
                System.out.println("Digite o número de WhatsApp: ");
                String whatsapp = scanner.nextLine();
                gerenciador.adicionarNotificador(new WhatsAppNotificacao(whatsapp));
                System.out.println("WhatsApp adicionado!");
                break;
            default:
                System.out.println(" Tipo inválido! Tente novamente.");
        }
    }

    private static void mostrarStatus(GerenciadorDeNotificacoes gerenciador) {
        System.out.println("\n STATUS DO SISTEMA");
        System.out.println("-".repeat(25));
        System.out.println("Canais ativos: " + gerenciador.getQuantidadeDeNotificadores());
        System.out.println("Sistema: Operacional");
    }

    private static void enviarTeste(GerenciadorDeNotificacoes gerenciador) {
        System.out.println("\n ENVIANDO NOTIFICAÇÃO DE TESTE...");
        String mensagemTeste = "Esta é uma mensagem de Teste do sistema de notificações. " +
                               "Se você recebeu esta mensagem, o canal está funcionando corretamente! " +
                               "Data/Hora: " + java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        gerenciador.notificarTodos(mensagemTeste);
    }
}
