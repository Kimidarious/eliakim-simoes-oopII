package Eliakim.Exercicio3;

public class Pix implements Pagamento{
    private String chavePixOrigem;
    private String chavePixDestino;

    public Pix(String chavePixOrigem, String chavePixDestino) {
        this.chavePixOrigem = chavePixOrigem;
        this.chavePixDestino = chavePixDestino;
    }

    @Override
    public void processarPagamento(double valor) {
        if (!Pagamento.validarValor(valor)) {
            System.out.println("Erro: valor inválido para pagamento!");
            return;
        }

        System.out.println("=== PROCESSANDO PAGAMENTO PIX ===");
        System.out.println("Método: PIX");
        System.out.println("De: " + mascarChave(chavePixOrigem));
        System.out.println("Para: " + mascarChave(chavePixDestino));
        System.out.println("Valor: " + Pagamento.formatarMoeda(valor));
        System.out.println("Status: Processando...");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println( "PIX realizado com sucesso!");
    }

    private String mascarChave(String chave) {
        if (chave.length() > 6) {
            return chave.substring(0, 3) + "***" + chave.substring(chave.length() - 3);
        }
        return chave;
    }
}
