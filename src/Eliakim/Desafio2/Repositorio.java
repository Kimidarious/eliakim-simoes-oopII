package Eliakim.Desafio2;

import java.util.List;

interface Repositorio<T> {
    void salvar(T obj);
    T buscarPorId(int id);
    List<T> listarTodos();
}
