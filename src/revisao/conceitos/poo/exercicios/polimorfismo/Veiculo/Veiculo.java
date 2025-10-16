package revisao.conceitos.poo.exercicios.polimorfismo.Veiculo;

abstract public class Veiculo {

    private String placa;
    private int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }


     public void exibirInformacoes() {
        System.out.println("------------------------------------------");
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano: " + this.ano);
    }

}
