package revisao.conceitos.interfaces.exercicios.veiculo;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Caminhao caminhao = new Caminhao();

        carro.iniciar();
        carro.buzinar();

        caminhao.iniciar();
        caminhao.buzinar();

    }
}
