package revisao.conceitos.abstractt.figurageometrica;

public class Retangulo extends FiguraGeometrica {

    private int base;
    private int altura;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int calcularArea() {
        return base*altura;
    }

    @Override
    public int calcularPerimetro() {
        return 2*(base+altura);
    }
}
