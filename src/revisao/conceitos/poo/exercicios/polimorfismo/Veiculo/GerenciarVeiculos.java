package revisao.conceitos.poo.exercicios.polimorfismo.Veiculo;

public class GerenciarVeiculos {
    public static void main(String[] args) {

        Onibus onibus = new Onibus("BLAKDA",2000,33);
        Caminhao caminhao = new Caminhao("SDJKSA",2010,10);

        onibus.exibirInformacoes();
        caminhao.exibirInformacoes();
    }
}
