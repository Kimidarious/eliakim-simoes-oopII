package Eliakim.Exercicio4;

import java.util.List;

public class BoundedGenericsExample {

    public static <T extends Comparable<T>> T max(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("A Lista não pode ser nula ou vazia!");
        }
        T maximo = lista.get(0);

        for (T elemento : lista) {
            if (elemento.compareTo(maximo) > 0) {
                maximo = elemento;
            }
        }
        return maximo;
    }
}
