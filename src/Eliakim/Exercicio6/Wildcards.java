package Eliakim.Exercicio6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wildcards {
    public static void imprimirNumeros(List<? extends Number> numeros) {
        System.out.println("=== IMPRIMINDO NÚMEROS ===");
        System.out.println("Tipo de lista: " + numeros.getClass().getSimpleName());
        System.out.println("Quantidade de elementos: " + numeros.size());
        System.out.println("números:");


        for (Number numero : numeros) {
            System.out.println(" " + numero + "(" +
                                numero.getClass().getSimpleName() + ")");
        }
        System.out.println();
    }

    public static void analisarNumeros(List<? extends Number> numeros) {
        if (numeros.isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }
        double soma = 0.0;
        double maior = numeros.get(0).doubleValue();
        double menor = numeros.get(0).doubleValue();

        System.out.println("=== ANÁLISE NÚMERICA ===");

        for (Number numero : numeros) {
            double valor = numero.doubleValue();
            soma += valor;
            if (valor > maior) maior = valor;
            if (valor < menor) menor = valor;
        }

        double media = soma / numeros.size();

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println();
    }

    public static void demonstrarConversões(List<? extends Number> numeros) {
        System.out.println("=== CONVERSÕES NUMÉRICAS ===");

        for (Number numero : numeros) {
            System.out.println("Número original: " + numero + "(" +
                                    numero.getClass().getSimpleName() + ")");

            System.out.println("  -> Int: " + numero.intValue());
            System.out.println("  -> Long: " + numero.longValue());
            System.out.println("  -> Float: " + numero.floatValue());
            System.out.println("  -> Double: " + numero.doubleValue());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 20);
        imprimirNumeros(inteiros);
        analisarNumeros(inteiros);

        List<Double> doubles = Arrays.asList(1.5, 2.7, 3.14, 4.8, 5.2);
        imprimirNumeros(doubles);
        analisarNumeros(doubles);

        List<Float> floats = new ArrayList<>();
        floats.add(1.1f);
        floats.add(2.2f);
        floats.add(3.3f);
        floats.add(4.4f);
        imprimirNumeros(floats);
        analisarNumeros(floats);

        List<Long> longs = Arrays.asList(100L, 200L, 300L, 400L, 500L);
        imprimirNumeros(longs);
        analisarNumeros(longs);

        List<Short> shorts = Arrays.asList((short) 1, (short) 2, (short) 3, (short) 4, (short) 5);
        imprimirNumeros(shorts);
        analisarNumeros(shorts);

        List<Byte> bytes = Arrays.asList((byte) 10, (byte) 20, (byte) 30, (byte) 40, (byte) 50);
        imprimirNumeros(bytes);
        analisarNumeros(bytes);

        List<Number> numerosMistos = new ArrayList<>();
        numerosMistos.add(100L);
        numerosMistos.add(2.7);
        numerosMistos.add(10);
        numerosMistos.add(100);
        numerosMistos.add(100.0);
        numerosMistos.add(100.0f);
        System.out.println("=== LISTA DE NÚMEROS MISTOS ===");
        imprimirNumeros(numerosMistos);
        analisarNumeros(numerosMistos);

        List<Double> paraConversao = Arrays.asList(10.5, 20.7, 30.9);
        demonstrarConversões(paraConversao);

        List<BigInteger> bigIntegers = Arrays.asList(
                new BigInteger("123456789012345"),
                new BigInteger("987654321098765"));
        imprimirNumeros(bigIntegers);

        List<BigDecimal> bigDecimals = Arrays.asList(
                new BigDecimal("123456789012345.123456789"),
                new BigDecimal("987654321098765.987654321")
        );
        imprimirNumeros(bigDecimals);

        System.out.println("=== EXEMPLO PRÁTICO: VENDAS MENSAIS ===");

        List<Double> vendasJaneiro = Arrays.asList(100.0, 200.0, 300.0, 400.0, 500.0);
        List<Double> vendasFevereiro = Arrays.asList(150.0, 250.0, 350.0, 450.0, 550.0);
        List<Double> vendasMarco = Arrays.asList(200.0, 300.0, 400.0, 500.0, 600.0);

        System.out.println("Vendas Janeiro:");
        imprimirNumeros(vendasJaneiro);
        analisarNumeros(vendasJaneiro);

        System.out.println("Vendas Fevereiro:");
        imprimirNumeros(vendasFevereiro);
        analisarNumeros(vendasFevereiro);

        System.out.println("Vendas Março:");
        imprimirNumeros(vendasMarco);
        analisarNumeros(vendasMarco);

        System.out.println("=== VANTAGENS DOS WILDCARDS ===");
        System.out.println("Sem Wildcards (extends Number), não poderiamos:");
        System.out.println("- Passar List<Integer> para um método que espera List<Number>");
        System.out.println("- Passar List<Double> para um método que espera List<Number>");
        System.out.println("- Ter um método genérico que aceite qualquer tipo de lista");
        System.out.println();
        System.out.println("Com wildcards, conseguimos polimorfismo em coleções genéricas!");
    }
}
