package Eliakim.Solid.Desafio3;

class PagamentoPix implements ProcessadorPagamento, CalculadorDesconto {
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
