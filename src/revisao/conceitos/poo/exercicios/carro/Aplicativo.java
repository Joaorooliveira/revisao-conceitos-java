package revisao.conceitos.poo.exercicios.carro;

public class Aplicativo {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Honda","Civic",2010);
        Carro carro2 = new Carro();
        Carro carro3 = new Carro("Audi","A3");

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
        carro3.exibirDetalhes();
    }
}
