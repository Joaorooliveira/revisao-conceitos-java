package revisao.conceitos.abstractt.figurageometrica;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10,5);
        System.out.println("A area desse retangulo e : "+retangulo.calcularArea());
        System.out.println("O perimetro desse retangulo e : "+retangulo.calcularPerimetro());
    }
}
