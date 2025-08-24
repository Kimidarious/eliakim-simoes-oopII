package Eliakim.Exercicio2;

class Calculadora implements OperacoesMatematicas {

    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida!");
        }
        return a / b;
    }

    public double calcularAreaCirculo(double raio){
        return PI * raio * raio;
    }

    public double calcularExponencialNatural(double expoente){
        return Math.pow(E, expoente);
    }
}
