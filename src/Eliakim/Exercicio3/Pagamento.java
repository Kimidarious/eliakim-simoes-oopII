package Eliakim.Exercicio3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface Pagamento {
    void processarPagamento(double valor);

    default void gerarRecibo(double valor){
        System.out.println("========== RECIBO ==========");
        System.out.println("Data: " +
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
        System.out.println("Status: Pagamento Processado!");
        System.out.println("=============================");
    }

    static boolean validarValor(double valor) {
        return valor > 0;
    }

    static String formatarMoeda(double valor) {
        return String.format("R$ %.2f", valor);
    }
}
