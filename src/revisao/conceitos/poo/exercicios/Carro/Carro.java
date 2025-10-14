package revisao.conceitos.poo.exercicios.Carro;

public class Carro {
    private String marcaDoCarro;
    private String modeloDoCarro;
    private int anoDoCarro;

    public Carro(String marcaDoCarro, String modeloDoCarro, int anoDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;
    }

    public Carro() {
    }

    public Carro(String marcaDoCarro, String modeloDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
    }

    public void exibirDetalhes(){
        System.out.println("---------------------------------");
        /*return "Modelo do Carro: "+ marcaDoCarro+
        "Modelo do carro: " + modeloDoCarro+
        "Ano do carro: " + anoDoCarro;*/
        System.out.println("Marca do carro: " + marcaDoCarro);
        System.out.println("Modelo do carro: " + modeloDoCarro);
        System.out.println("Ano do carro: " + anoDoCarro);
    }
}
