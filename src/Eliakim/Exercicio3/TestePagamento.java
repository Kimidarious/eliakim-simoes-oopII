package Eliakim.Exercicio3;

public class TestePagamento {
    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito("1234-5678-9012-3456", "Eliakim Simões");
        Pix pix = new Pix("kim@simoes", "rapha@rodrigues");

        double valor1 = 150.75;
        double valor2 = 89.90;
        double valorInvalido = -50.0;

        System.out.println("=== SISTEMA DE PAGAMENTOS ===\n");

        System.out.println("=== VALIDÇÃO DE VALORES ===");
        System.out.println("Valor: " + Pagamento.formatarMoeda(valor1) + "é válido? " +
                Pagamento.validarValor(valor1));
        System.out.println("Valor " + Pagamento.formatarMoeda(valorInvalido) + "é válido?" +
                Pagamento.validarValor(valorInvalido));
        System.out.println();


        //TESTE 1: PAGAMENTO COM CARTÃO DE CRÉDITO
        System.out.println("*** TESTE 1: CARTÃO DE CRÉDITO ***");
        cartao.processarPagamento(valor1);
        cartao.gerarRecibo(valor1);
        System.out.println();


        //TESTE 2: PAGAMENTO COM PIX
        System.out.println("*** TESTE 2: PIX ***");
        pix.processarPagamento(valor2);
        pix.gerarRecibo(valor2);
        System.out.println();

        //TESTE 3: VALOR INVÁLIDO
        System.out.println("*** TESTE 3: VALOR INVÁLIDO ***");
        cartao.processarPagamento(valorInvalido);
        System.out.println();

        // Demonstrando chamada direta dos métodos static
        System.out.println("*** MÉTODOS STATIC DA INTERFACE ***");
        System.out.println("Validação direta: " + Pagamento.validarValor(100.0));
        System.out.println("Formatação direta: " + Pagamento.formatarMoeda(250.99));
    }
}
