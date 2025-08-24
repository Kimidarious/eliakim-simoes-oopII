package Eliakim.Exercicio2;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== OPERAÇÕES MATEMÁTICAS ===");
        System.out.println("Soma: 10 + 5 = " + calc.somar(10, 5));
        System.out.println("Subtrair: 10 - 5 = " + calc.subtrair(10, 5));
        System.out.println("Multiplicar: 10 * 5 = " + calc.multiplicar(10, 5));
        System.out.println("Dividir: 10 / 5 = " + calc.dividir(10, 5));


        System.out.println("=== USO DAS CONSTANTES ===");
        System.out.println("Valor de PI: " + OperacoesMatematicas.PI);
        System.out.println("Valor de E: " + OperacoesMatematicas.E);
        System.out.println("Área do Círculo (raio 3): " + calc.calcularAreaCirculo(3));
        System.out.println("Exponencial Natural (expoente 2): " + calc.calcularExponencialNatural(2));

        try {
            System.out.println("\n===TESTE DE DIVISÃO POR ZERO ===");
            calc.dividir(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
