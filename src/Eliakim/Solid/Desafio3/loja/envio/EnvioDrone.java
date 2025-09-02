package Eliakim.Solid.Desafio3.loja.envio;

import Eliakim.Solid.Desafio3.loja.interfaces.CalculadorFrete;
import Eliakim.Solid.Desafio3.loja.interfaces.ServicoEnvio;
import Eliakim.Solid.Desafio3.loja.model.Pedido;

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
