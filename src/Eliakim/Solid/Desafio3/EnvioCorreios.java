package Eliakim.Solid.Desafio3;

class EnvioCorreios implements ServicoEnvio, CalculadorFrete{
    @Override
    public boolean enviarPedido(Pedido pedido) {
        System.out.println("Enviando pedido " + pedido.getId() + " via Correios");
        return true;
    }

    @Override
    public double calcularFrete(String cep)  {
        return 15.0;
    }
}
