package revisao.conceitos.poo.exercicios.Carro;

public class Carro {
    private String MarcaDoCarro;
    private String ModeloDoCarro;
    private int anoDoCarro;

    public Carro(String marcaDoCarro, String modeloDoCarro, int anoDoCarro) {
        MarcaDoCarro = marcaDoCarro;
        ModeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;
    }

    public Carro() {
    }

    public Carro(String marcaDoCarro, String modeloDoCarro) {
        MarcaDoCarro = marcaDoCarro;
        ModeloDoCarro = modeloDoCarro;
    }

    public void exibirDetalhes(){
        System.out.println("---------------------------------");
        System.out.println("Marca do carro: " + MarcaDoCarro);
        System.out.println("Modelo do carro: " + ModeloDoCarro);
        System.out.println("Ano do carro: " + anoDoCarro);
    }
}
