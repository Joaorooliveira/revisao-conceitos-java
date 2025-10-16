package revisao.conceitos.poo.exercicios.polimorfismo.calculadora;

public class Soma extends Operacao {

    @Override
    public double calcular(double a, double b) {
        return a+b;
    }
}
