package Eliakim.Exercicio3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CartaoCredito implements Pagamento{
    private String numeroCartao;
    private String nomeTitular;

    public CartaoCredito(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void processarPagamento(double valor) {
        if (!Pagamento.validarValor(valor)) {
            System.out.println("Erro: valor inválido para pagamento!");
            return;
        }

        System.out.println("=== PROCESSANDO PAGAMENTO CARTÃO CREDITO ===");
        System.out.println("Método: Cartão de Crédito");
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Cartão: ****-****-****- " +
                numeroCartao.substring(numeroCartao.length() - 4));
        System.out.println("Valor: " + Pagamento.formatarMoeda(valor));
        System.out.println("Status: Aprovado!");
        System.out.println("Processando... Aguarde...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println( "Pagamento realizado com sucesso!");
    }

    @Override
    public void gerarRecibo(double valor) {
        System.out.println("========== RECIBO CARTÃO CREDITO==========");
        System.out.println("Data: " +
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("Método: Cartão de Crédito");
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Cartão: ****-" + numeroCartao.substring(numeroCartao.length() - 4));
        System.out.println("Valor: " + Pagamento.formatarMoeda(valor));
        System.out.println("Status: Aprovado!");
        System.out.println("Código de Autorização: " + (int)(Math.random() * 1000000));
        System.out.println("============================================");
    }
}
