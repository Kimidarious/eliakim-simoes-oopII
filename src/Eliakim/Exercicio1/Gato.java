package Eliakim.Exercicio1;

import org.w3c.dom.ls.LSOutput;

public class Gato implements Animal{
    private String nome;

    public Gato(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " faz: Miau miau!");
    }

    @Override
    public void mover(){
        System.out.println(nome + " está caminhando silenciosamente");
    }

    public String getNome() {
        return nome;
    }
}
