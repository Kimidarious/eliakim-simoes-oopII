package Eliakim.Solid.Desafio3.loja.interfaces;

import Eliakim.Solid.Desafio3.loja.model.Pedido;

interface ServicoEnvio {
    boolean enviarPedido(Pedido pedido);
}
