package Eliakim.Desafio2;

class RepositorioProduto extends RepositorioMemoria<Produto> {
    @Override
    public Produto buscarPorId(int id) {
        for (Produto produto : dados) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

}
