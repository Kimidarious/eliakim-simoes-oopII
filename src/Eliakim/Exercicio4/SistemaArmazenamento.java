package Eliakim.Exercicio4;

import java.util.Arrays;
import java.util.List;

public class SistemaArmazenamento {
    public static void main(String[] args) {
        System.out.println("==== SISTEMA DE GERENCIAMENTO DE ARQUIVOS ===\n");
        System.out.println("Demonstração de Polimorfismo com Interfaces");
        System.out.println("-".repeat(60));
        System.out.println();

        BancoDeDados bd = new BancoDeDados("usuarios");
        ArquivoTexto arquivo = new ArquivoTexto("log_sistema.txt");

        List<Armazenamento> armazenamentos = Arrays.asList(bd, arquivo);

        GerenciadorArmazenamento gerenciador = new GerenciadorArmazenamento();
        gerenciador.adicionarArmazenamento(bd);
        gerenciador.adicionarArmazenamento(arquivo);
        System.out.println();

        String[] dados = {
                "Usuário admin logado no sistema",
                "Backup iniciado às 10:30",
                "Sistema atualizado para versão 2.1",
                "Erro corrigido no módulo de relatórios"
        };

        for (String dado : dados) {
            gerenciador.salvarEmTodos(dado);
            System.out.println(" Aguardando próxima operação...\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        gerenciador.lerTodos();

        gerenciador.mostrarEstatisticas();

        System.out.println(" DEMONSTRAÇÃO ADICIONAL DE POLIMORFISMO");
        System.out.println("=".repeat(60));

        Armazenamento[] diversosArmazenamentos = {
                new BancoDeDados("produtos"),
                new ArquivoTexto("auditoria.log"),
                new BancoDeDados("vendas")
        };

        for (Armazenamento armazenamento : diversosArmazenamentos) {
            System.out.println("Processando: " + armazenamento.getTipo());
            armazenamento.salvar("Teste de polimorfismo - " + System.currentTimeMillis());
        }

        System.out.println("\nDemonstração concluída!");
        System.out.println("Polimorfismo permite tratar objetos diferentes de forma uniforme!");
     }
}
