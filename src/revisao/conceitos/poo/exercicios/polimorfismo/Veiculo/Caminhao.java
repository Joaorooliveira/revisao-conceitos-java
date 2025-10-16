package revisao.conceitos.poo.exercicios.polimorfismo.Veiculo;

public class Caminhao extends Veiculo{

    private int eixos;

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Eixos: " + eixos);
    }

    public Caminhao(String placa, int ano,int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

}
