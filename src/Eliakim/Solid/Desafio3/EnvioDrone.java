package Eliakim.Solid.Desafio3;

public class EnvioDrone implements ServicoEnvio, CalculadorFrete {
    @Override
    public boolean enviarPedido(Pedido pedido) {
        System.out.println("Enviando pedido " +  pedido.getId() + " via Drone");
        return true;
    }

    public  double calcularFrete(String cep) {
        return  50.0;
    }
}
