package Eliakim.Solid.Desafio3;

class PagamentoBoleto implements ProcessadorPagamento, CalculadorDesconto {
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Gerando Boleto para pagamento: R$" + valor);
        return true;
    }

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.03;
    }
}
