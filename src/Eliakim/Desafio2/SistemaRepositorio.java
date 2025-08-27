package Eliakim.Desafio2;

public class SistemaRepositorio {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE REPOSITÓRIO GENÉRICO ===\n");

        System.out.println("--- TESTANDO REPOSITÓRIO DE PRODUTOS ---");
        RepositorioProduto repositorioProdutos = new RepositorioProduto();

        repositorioProdutos.salvar(new Produto(1, "Notebook Dell", 2500.00));
        repositorioProdutos.salvar(new Produto(2, "Mouse Logitech", 85.50));
        repositorioProdutos.salvar(new Produto(3, "Teclado Mecânico", 299.90));

        System.out.println("Produtos salvos com sucesso!\n");
        for (Produto produto : repositorioProdutos.listarTodos()) {
            System.out.println(" " + produto);
        }

        System.out.println("\nBuscando Produto com id 2:");
        Produto produtoEncontrado = repositorioProdutos.buscarPorId(2);
        if (produtoEncontrado != null) {
            System.out.println(" Encontrado: " + produtoEncontrado);
        } else {
            System.out.println(" Produto não encontrado");
        }

        System.out.println("\nBuscando Produto com id 99(inexistente):");
        Produto produtoInexistente = repositorioProdutos.buscarPorId(99);
        if (produtoInexistente != null) {
            System.out.println(" Encontrado: " + produtoInexistente);
        } else {
            System.out.println(" Produto não encontrado!");
        }

        System.out.println("\n" + "=".repeat(50) + "\n");

        System.out.println("--- TESTANDO REPOSITÓRIO DE CLIENTES ---");
        RepositorioCliente repositorioClientes = new RepositorioCliente();

        repositorioClientes.salvar(new Cliente(1, "João Silva", "joao@email.com"));
        repositorioClientes.salvar(new Cliente(2, "Maria Costa", "maria@email.com"));
        repositorioClientes.salvar(new Cliente(3, "Pedro Alonso", "pedro@email.com"));

        System.out.println("Clientes salvos com sucesso!\n");
        for (Cliente cliente : repositorioClientes.listarTodos()) {
            System.out.println(" " + cliente);
        }

        System.out.println("\nBuscando Cliente com id 1:");
        Cliente clienteEncontrado = repositorioClientes.buscarPorId(1);
        if (clienteEncontrado != null) {
            System.out.println(" Encontrado: " + clienteEncontrado);
        } else {
            System.out.println(" Cliente não encontrado!");
        }

        System.out.println("\nBuscando Cliente com id 88 (inexistente):");
        Cliente clienteInexistente = repositorioClientes.buscarPorId(88);
        if (clienteInexistente != null) {
            System.out.println(" Encontrado: " + clienteInexistente);
        } else {
            System.out.println(" Cliente não encontrado!");
        }

        System.out.println("\n" + "=".repeat(50) + "\n");

        System.out.println("--- DEMONSTRAÇÃO DA NATUREZA GENÉRICA ---");
        System.out.println("Total de produtos no repositório: " +
                                        repositorioProdutos.listarTodos().size());
        System.out.println("Total de clientes no repositório: " +
                                        repositorioClientes.listarTodos().size());

        Repositorio<Produto> repoGenericoProduto = repositorioProdutos;
        Repositorio<Cliente> repoGenericoCliente = repositorioClientes;

        System.out.println("\nUsando referências genéricas:");
        System.out.println("Produtos via referência genèrica: " + repoGenericoProduto.listarTodos().size());
        System.out.println("Clientes via referência genérica: " + repoGenericoCliente.listarTodos().size());

        System.out.println("\n Sistema de repositório genérico funcionando perfeitamente!");

    }
}
