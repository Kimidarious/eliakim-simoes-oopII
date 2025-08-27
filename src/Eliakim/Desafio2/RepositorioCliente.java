package Eliakim.Desafio2;

public class RepositorioCliente extends RepositorioMemoria<Cliente>{
    @Override
    public Cliente buscarPorId(int id) {
        for (Cliente cliente : dados) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }
}
