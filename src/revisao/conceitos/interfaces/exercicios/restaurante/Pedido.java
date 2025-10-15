package revisao.conceitos.interfaces.exercicios.restaurante;

public class Pedido implements PedidoRestaurante {

    private String nome;
    private double preco;
    private double soma ;



    /*public Pedido(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }*/

    @Override
    public void adicionarItem(String item, double preco) {
        System.out.println(item+": Adicionado"+" Seu preco: "+preco);
        this.nome=item;
        this.preco=preco;
        this.soma += preco;
        System.out.println("--------------------");
    }

    @Override
    public void calcularTotal() {
        System.out.println("Total do pedido: "+soma);
    }
}
