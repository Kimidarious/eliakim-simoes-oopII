package Eliakim.Exercicio5;

import java.util.ArrayList;
import java.util.List;

public class TestePar {
    public static void main(String[] args) {
        List<Par<Integer, String>> alunos = new ArrayList<>();

        alunos.add(new Par<>(1, "Eliakim"));
        alunos.add(new Par<>(2, "Elias"));
        alunos.add(new Par<>(3, "Eliane"));
        alunos.add(new Par<>(4, "Pedro"));
        alunos.add(new Par<>(5, "Raphael"));
        alunos.add(new Par<>(6, "Vanessa"));
        alunos.add(new Par<>(7, "Lara"));
        alunos.add(new Par<>(8, "Maria"));

        System.out.println("=== LISTA DE ALUNOS ===");
        System.out.println("Total de alunos: " + alunos.size());
        System.out.println();

        for (Par<Integer, String> aluno : alunos) {
            System.out.println("Matricula: " + aluno.getChave() +
                                " - Nome: " + aluno.getValor() +
                                "");
        }

        System.out.println();
        System.out.println("=== DEMONSTRAÇÃO DE FLEXIBILIDADE ===");

        List<Par<String, Double>> notas = new ArrayList<>();
        notas.add(new Par<>("Matemática", 9.5));
        notas.add(new Par<>("Português", 8.5));
        notas.add(new Par<>("História", 7.5));

        System.out.println("pares disciplina-nota:");
        for (Par<String, Double> nota : notas) {
            System.out.println("Disciplina: " + nota.getChave() +
                                         "| Nota: " + nota.getValor());
        }

        Par<String, Integer> idadePessoa = new Par<>("Eliakim", 25);
        Par<Boolean, String> statusMensagem = new Par<>(true, "Operação realizada com sucesso");

        System.out.println();
        System.out.println("Outros Exemplos:");
        System.out.println(idadePessoa);
        System.out.println(statusMensagem);

        System.out.println();
        System.out.println("=== MODIFICANDO VALORES ===");
        Par<Integer, String> primeiroAluno = alunos.get(0);
        System.out.println("Antes: " + primeiroAluno);

        primeiroAluno.setValor("Eliane");
        System.out.println("Depois: " + primeiroAluno);

        System.out.println();
        System.out.println("=== BUSCA POR MATRICULA ===");
        int matriculaBusca = 3;
        for (Par<Integer, String> aluno : alunos) {
            if (aluno.getChave().equals(matriculaBusca)) {
                System.out.println("Aluno encontrado: " + aluno.getValor());
                break;
            }
        }
    }
}
