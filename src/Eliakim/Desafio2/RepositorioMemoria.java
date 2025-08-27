package Eliakim.Desafio2;

import java.util.ArrayList;
import java.util.List;

abstract class RepositorioMemoria <T> implements Repositorio<T> {
    protected List<T> dados;
    public RepositorioMemoria() {
        this.dados = new ArrayList<>();
    }

    public void salvar(T obj) {
        dados.add(obj);
    }

    @Override
    public abstract T buscarPorId(int id);

    @Override
    public List<T> listarTodos() {
        return new ArrayList<>(dados);
    }
}
