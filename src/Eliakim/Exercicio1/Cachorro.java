package Eliakim.Exercicio1;

public class Cachorro implements Animal{
    private String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Au au au!");
    }

    @Override
    public void mover(){
        System.out.println(nome + " está correndo e abanando o rabo");
    }

    public String getNome() {
        return nome;
    }
}
