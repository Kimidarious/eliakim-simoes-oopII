package Eliakim.Exercicio5;

public class Par<K, V>{
    private K chave;
    private V valor;

    public Par(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() {
        return chave;
    }

    public void setChave(K chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Par{chave=" + chave + ", valor=" + valor + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (getClass() != obj.getClass()) return false;

        Par<?, ?> par = (Par<?, ?>) obj;

        if (chave != null ? !chave.equals(par.chave) : par.chave != null) return false;
        return valor != null ? valor.equals(par.valor) : par.valor == null;
    }

    @Override
    public int hashCode() {
        int result = chave != null ? chave.hashCode() : 0;
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        return result;
    }
}
