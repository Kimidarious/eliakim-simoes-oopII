package Eliakim.Exercicio1;

public class Caixa<T> {

    private T item;

    public Caixa() {
        this.item = null;
    }

    public Caixa(T item) {
        this.item = item;
    }

    public void set(T item) {
        this.item = item;
        System.out.println("Item adicionado na caixa: " + item);
    }

    public T get() {
        return this.item;
    }

    public boolean estaVazia() {
        return this.item == null;
    }

    public void limpar() {
        this.item = null;
        System.out.println("Caixa foi limpa");
    }

    @Override
    public String toString() {
        if (estaVazia()) {
            return "Caixa vazia";
        }
        return "Caixa contém " + item + " (Tipo: " + item.getClass().getSimpleName() + ")";
    }

    public String getTipoDoItem() {
        if (estaVazia()) {
            return "Caixa vazia - sem tipo vazio definido";
        }
        return item.getClass().getSimpleName();
    }
}
