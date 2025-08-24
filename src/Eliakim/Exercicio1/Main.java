package Eliakim.Exercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Exercício de Interface Animal====\n");
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Mimi");

        System.out.println("---- Cachorro ----");
        cachorro.emitirSom();
        cachorro.mover();

        System.out.println();

        System.out.println("---- Gato ----");
        gato.emitirSom();
        gato.mover();

        System.out.println();

        System.out.println("---- Usando Polimorfismo ----");
        Animal[] animais = { cachorro, gato };

        for (Animal animal : animais) {
            animal.emitirSom();
            animal.mover();
            System.out.println();
        }
    }
}
