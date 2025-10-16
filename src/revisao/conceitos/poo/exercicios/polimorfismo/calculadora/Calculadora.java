package revisao.conceitos.poo.exercicios.polimorfismo.calculadora;

public class Calculadora {
    public static void main(String[] args) {
        Operacao calculadora = new Soma();
        Operacao calculadora2 = new Subtracao();
        Operacao calculadora3 = new Multiplicacao();
        Operacao calculadora4 = new Divisao();

        System.out.println("Resultado soma: "+calculadora.calcular(5,5));
        System.out.println("Resultado Subtracao: "+calculadora2.calcular(5,5));
        System.out.println("Resultado Multiplicacao: "+calculadora3.calcular(5,5));
        System.out.println("Resultado Divisao: "+calculadora4.calcular(5,5));

    }
}
