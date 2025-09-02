package Eliakim.Solid.Desafio3.loja.pagamento;

import Eliakim.Solid.Desafio3.loja.interfaces.CalculadorDesconto;
import Eliakim.Solid.Desafio3.loja.interfaces.ProcessadorPagamento;

public class PagamentoPix implements ProcessadorPagamento, CalculadorDesconto {
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Processando pagamento via PIX: R$ " + valor);
        return valor > 0;
    }

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.05;
    }
}
