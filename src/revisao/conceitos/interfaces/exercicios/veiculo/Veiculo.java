package revisao.conceitos.interfaces.exercicios.veiculo;

public interface Veiculo {
    void iniciar();
    void parar();
    default void buzinar(){
        System.out.println("Buzinando");
    };

}
