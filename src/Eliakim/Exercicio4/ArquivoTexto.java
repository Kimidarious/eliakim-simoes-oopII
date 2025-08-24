package Eliakim.Exercicio4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class ArquivoTexto implements Armazenamento {
    private List<String> linhas;
    private String nomeArquivo;

    public ArquivoTexto(String nomeArquivo) {
        this.linhas = new ArrayList<>();
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void salvar(String dado) {
        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        String linha = "[" + timestamp + "] " + dado;

        System.out.println("ARQUIVO TEXTO - SALVANDO");
        System.out.println("Arquivo: " + nomeArquivo);
        System.out.println("Abrindo arquivo para escrita...");
        System.out.println("Adicionando linha: " + linha);

        linhas.add(linha);

        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Dados salvo com sucesso!");
        System.out.println("Total de Linhas: " + linhas.size());
        System.out.println();
    }

    @Override
    public String ler() {
        if (linhas.isEmpty()) {
            return "Arquivo vazio ou não existe!";
        }
        System.out.println("ARQUIVO TEXTO - Lendo");
        System.out.println("Abrindo arquivo: " + nomeArquivo);

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        StringBuilder conteudo = new StringBuilder();
        conteudo.append("=== CONTEÚDO DO ARQUIVO ===\n");
        conteudo.append("Nome do arquivo: ").append(nomeArquivo).append("\n");
        conteudo.append("Total de linhas: ").append(linhas.size()).append("\n");

        int numeroLinha = 1;
        for (String linha : linhas) {
            conteudo.append(String.format("%03d: - %s\n", numeroLinha++, linha));
        }

        System.out.println("ARQUIVO LIDO COM SUCESSO!");
        return conteudo.toString();
    }

    @Override
    public String getTipo() {
        return "Arquivo de Texto (" + nomeArquivo + ")";
    }

    public void limparArquivo() {
        linhas.clear();
        System.out.println("Arquivo " + nomeArquivo + " limpado com sucesso!");
    }
}
