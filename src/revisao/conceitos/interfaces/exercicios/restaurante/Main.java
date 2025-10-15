package revisao.conceitos.interfaces.exercicios.restaurante;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.adicionarItem("Hamburguer",15.90);
        pedido.adicionarItem("Batata Frita",10.90);
        pedido.adicionarItem("Refrigerante",12.90);

        pedido.calcularTotal();

        /*Pedido pedido1 = new Pedido("Hamburguer",15.90);
        Pedido pedido2 = new Pedido("Batata Frita",10.90);
        Pedido pedido3 = new Pedido("Refrigerante",12.90);*/


    }
}
