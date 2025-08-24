package Eliakim.Exercicio4;

interface Armazenamento {
    void salvar(String dado);
    String ler();

    default String getTipo() {
        return "Armazenamento genérico";
    }

    default boolean temDados() {
        String dados = ler();
        return dados != null && !dados.trim().isEmpty();
    }
}
