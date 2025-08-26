package Eliakim.Exercicio1;

public class TesteCaixaGenerica {
    public static void main(String[] args) {
        System.out.println("TESTE DA CLASSE GENERICA CAIXA<T>");
        System.out.println("=".repeat(50));
        System.out.println();

        System.out.println("TESTE 1: CAIXA DE STRING");
        System.out.println("-".repeat(30));

        Caixa<String> caixaString = new Caixa<>();
        System.out.println("Estado inicial: " + caixaString);
        System.out.println("Está vazia? " + caixaString.estaVazia());

        caixaString.set("Olá, Mundo!");
        System.out.println("Após adicionar: " +caixaString);
        System.out.println("Recuperado: " + caixaString.get());
        System.out.println("Tipo do item: " + caixaString.getTipoDoItem());
        System.out.println();

        System.out.println(" TESTE 2: CAIXA DE INTEGER");
        System.out.println("-".repeat(30));

        Caixa<Integer> caixaInteger = new Caixa<>(42);
        System.out.println("Criada com valor: " + caixaInteger);
        System.out.println("Valor recuperado: " + caixaInteger.get());
        System.out.println("Tipo do item: " + caixaInteger.getTipoDoItem());

        caixaInteger.set(100);
        System.out.println("Novo valor: " + caixaInteger.get());
        System.out.println();

        System.out.println("TESTE 3: CAIXA DE DOUBLE");
        System.out.println("-".repeat(30));

        Caixa<Double> caixaDouble = new Caixa<>();
        caixaDouble.set(3.14159);
        System.out.println("Caixa de Double: " + caixaDouble);
        System.out.println("Valor com precisão: " + String.format("%.2f", caixaDouble.get()));
        System.out.println("Tipo do item: " + caixaDouble.getTipoDoItem());
        System.out.println();

        System.out.println("TESTE 4: CAIXA DE BOOLEAN");
        System.out.println("-".repeat(30));

        Caixa<Boolean> caixaBoolean = new Caixa<>(true);
        System.out.println("Caixa de Boolean: " + caixaBoolean);
        System.out.println("Valor lógico: " + caixaBoolean.get());
        System.out.println();

        System.out.println("TESTE 5: DEMONSTRANDO TYPE SAFETY (SEGURANÇA DE TIPOS)");
        System.out.println("-".repeat(45));

        Caixa<String> caixaSegura = new Caixa<>();
        caixaSegura.set("Texto seguro");
        String textoRecuperado = caixaSegura.get();
        System.out.println("Texto recuperado sem cast: " + textoRecuperado);
        System.out.println();

        System.out.println("TESTE 6: OPERAÇÕES COM DIFERENTES CAIXAS");
        System.out.println("-".repeat(45));

        demonstrarOperacoes();

        System.out.println("TESTE 7: LIMPANDO AS CAIXAS");
        System.out.println("-".repeat(30));

        caixaString.limpar();
        caixaInteger.limpar();
        caixaDouble.limpar();
        caixaBoolean.limpar();

        System.out.println("String após limpeza: " + caixaString);
        System.out.println("Integer após limpar: " + caixaInteger);
        System.out.println("Double após limpar: " + caixaDouble);
        System.out.println("Boolean após limpar: " + caixaBoolean);

        System.out.println("\n Todos os testes concluídos com sucesso!");
        System.out.println("Generics proporcionam type safety e reutilização de código!");


    }

    private static void demonstrarOperacoes() {
        Caixa<Integer> num1 = new Caixa<>(10);
        Caixa<Integer> num2 = new Caixa<>(20);
        Caixa<String> texto1 = new Caixa<>("Java ");
        Caixa<String> texto2 = new Caixa<>("Generics!");

        Integer soma = num1.get() + num2.get();
        System.out.println("Soma das caixas numéricas: " + soma);


        String TextoCompleto = texto1.get() + texto2.get();
        System.out.println("Concatenação das caixas de texto: " +
                            TextoCompleto);

        System.out.println("Caixas númericas são iguais? " +
                            num1.get().equals(num2.get()));
        System.out.println("Primeira caixa é maior? " + (num1.get() > num2.get()));
    }
}
