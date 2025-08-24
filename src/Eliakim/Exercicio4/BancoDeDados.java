package Eliakim.Exercicio4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

class BancoDeDados implements Armazenamento{
    private Map<String, String> tabela;
    private String nomeTabela;
    private int proximoId;

    public BancoDeDados(String nomeTabela) {
        this.tabela = new HashMap<>();
        this.nomeTabela = nomeTabela;
        this.proximoId = 1;
    }

    @Override
    public void salvar(String dado) {
        String timestamp = LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        String chave = "ID " + proximoId++;
        String registro = "[" + timestamp + "] " + dado;

        tabela.put(chave, registro);

        System.out.println("BANCO DE DADOS - SALVANDO");
        System.out.println("Conectando ao banco...");
        System.out.println("Tabela: " + nomeTabela);
        System.out.println("Chave: " + chave);
        System.out.println("Executando INSERT...");

        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Registro salvo com sucesso no banco!");
        System.out.println("Total de Registros: " + tabela.size());
        System.out.println();
    }

    @Override
    public String ler() {
        if (tabela.isEmpty()) {
            return "Nenhum dado encontrado no banco de dados!";
        }

        System.out.println("BANCO DE DADOS - LENDO");
        System.out.println("Executando SELECT * FROM " + nomeTabela + "...");

        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        StringBuilder resultado = new StringBuilder();
        resultado.append("=== DADOS DO BANCO ===\n");
        resultado.append("Tabela: ").append(nomeTabela).append("\n");
        resultado.append("Registros encontrados: ").append(tabela.size()).append("\n");

        for (Map.Entry<String, String> entry : tabela.entrySet()) {
            resultado.append(entry.getKey()).append(":")
                    .append(entry.getValue()).append("\n");
        }
        System.out.println(" Consulta executada com sucesso!");
        return resultado.toString();
    }

    @Override
    public String getTipo() {
        return "Banco de Dados (" + nomeTabela + ")";
    }

    public void limparTabela() {
        tabela.clear();
        proximoId = 1;
        System.out.println("Tabela " + nomeTabela + " limpada com sucesso!");
    }
}
