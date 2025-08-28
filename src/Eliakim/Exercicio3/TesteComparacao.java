package Eliakim.Exercicio3;

public class TesteComparacao {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook Dell", 2500.00);
        Produto produto2 = new Produto("Teclado Mecânico", 170.00);
        Produto produto3 = new Produto("Mouse Logitech", 250.00);

        System.out.println("=== TESTE DE COMPARAÇÃO ENTRE PRODUTOS ===");
        System.out.println("Produto 1: " + produto1);
        System.out.println("Produto 2: " + produto2);
        System.out.println("Produto 3: " + produto3);
        System.out.println();

        System.out.println("Comparações");
        System.out.println(produto1 + " é maior que " +
                            produto2 + "?" + produto1.maiorQue(produto2));
        System.out.println(produto2 + " é maior que " +
                                    produto1 + "?" + produto2.maiorQue(produto1));
        System.out.println(produto3 + " é maior que " +
                                    produto2 + "?" + produto3.maiorQue(produto2));
        System.out.println(produto1 + " é maior que " + produto3 + "?" +
                                    produto1.maiorQue(produto3));

        Produto produto4 = new Produto("Monitor LG", 250.00);
        System.out.println();
        System.out.println("Teste com preços iguais: ");
        System.out.println("Produto 3: " + produto3);
        System.out.println("Produto 4: " + produto4);
        System.out.println(produto3 + " é maior que " + produto4 + "?" +
                                    produto3.maiorQue(produto4));

        System.out.println();
        System.out.println("=== DEMONSTRAÇÃO DE USO GENÉRICO === ");
        compararProdutos(produto1, produto2);
        compararProdutos(produto3, produto4);


    }
    public static <T extends Comparavel<T>> void compararProdutos(T item1, T item2) {
        System.out.println("Comparando: " + item1 + " com " + item2);
        if (item1.maiorQue(item2)) {
            System.out.println("O primeiro item é maior que o segundo.");
        } else {
            System.out.println("O primeiro item não é maior que o segundo.");
        }
    }
}
