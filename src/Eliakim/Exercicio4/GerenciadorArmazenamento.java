package Eliakim.Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorArmazenamento {
    private List<Armazenamento> armazenamentos;

    public GerenciadorArmazenamento() {
        this.armazenamentos = new ArrayList<>();
    }

    public void adicionarArmazenamento(Armazenamento armazenamento){
        armazenamentos.add(armazenamento);
        System.out.println("Adicionado o armazenamento " + armazenamento.getTipo());
    }

    public void salvarEmTodos(String dado){
        System.out.println("SALVANDO EM TODOS ARMAZENAMENTOS");
        System.out.println("Dado: \"" + dado + "\"");
        System.out.println("=".repeat(50));

        for (Armazenamento armazenamento : armazenamentos) {
            armazenamento.salvar(dado);
        }
    }

    public void lerTodos(){
        System.out.println("LENDO TODOS OS ARMAZENAMENTOS");
        System.out.println("=".repeat(50));

        for (Armazenamento armazenamento : armazenamentos) {
            System.out.println("Tipo " + armazenamento.getTipo());
            System.out.println(armazenamento.ler());
            System.out.println("-".repeat(30));
        }
    }

    public void mostrarEstatisticas(){
        System.out.println("ESTATISTICAS DOS ARMAZENAMENTOS");
        System.out.println("=".repeat(50));

        for (int i = 0; i < armazenamentos.size(); i++) {
            Armazenamento armazenamento = armazenamentos.get(i);
            System.out.println((i + 1) + " . " + armazenamento.getTipo());
            System.out.println(" Tem dados: " + (armazenamento.temDados() ? "Sim " : "Não"));
        }
        System.out.println();
    }
}
