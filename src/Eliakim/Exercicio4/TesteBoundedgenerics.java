package Eliakim.Exercicio4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static Eliakim.Exercicio4.BoundedGenericsExample.max;

public class TesteBoundedgenerics {
    public static void main(String[] args) {
        System.out.println("=== TESTE COM INTEGER ===");
        List<Integer> numeros = Arrays.asList(10, 5, 8, 20, 3, 15);
        System.out.println("Lista: " + numeros);
        System.out.println("Maior Integer: " + max(numeros));

        System.out.println("\n=== TESTE COM DOUBLE");
        List<Double> decimais = Arrays.asList(3.14, 2.71, 1.41, 4.20, 0.57);
        System.out.println("Lista: " + decimais);
        System.out.println("Maior Double: " + max(decimais));

        System.out.println("\n=== TESTE COM STRING ===");
        List<String> palavras = Arrays.asList("zebra", "maçã", "banana", "cereja", "laranja");
        System.out.println("Lista: " + palavras);
        System.out.println("Maior String (ordem lexicográfica): " + max(palavras));

        System.out.println("\n=== TESTE COM STRINGS POR COMPRIMENTO ===");
        List<String> frases = Arrays.asList("a", "hello", "world", "programmimg", "java");
        System.out.println("Lista: " + frases);
        System.out.println("Maior String por comprimento: " + maxComprimento(frases));

        System.out.println("\n=== TESTE COM LISTA VAZIA ===");
        try {
            List<Integer> listaVazia = Arrays.asList();
            max(listaVazia);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        System.out.println("\n=== TESTE COM CLASSE PERSONALIZADA ===");
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", 25),
                new Pessoa("João", 30),
                new Pessoa("Maria", 28)
        );
        System.out.println("Lista de pessoas: " + pessoas);
        System.out.println("Pessoa mais velha: " + max(pessoas));
    }

    public static String maxComprimento(List<String> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("A Lista não pode ser nula ou vazia!");
        }

        return lista.stream()
                .max(Comparator.comparing(String::length))
                .orElse("");
    }
}
