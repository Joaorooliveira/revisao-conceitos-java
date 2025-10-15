package revisao.conceitos.interfaces.exercicios.produto;

public class Main {
    public static void main(String[] args) {
        ProdutoImpl p1 = new ProdutoImpl("Cadeira",2);
        System.out.println("Produto: " + p1.getNome());
        System.out.println("Estoque inicial: " + p1.getQuantidade());
        System.out.println("--------------------");

        p1.adicionarQuantidade(10);
        p1.removerQuantidade(1);
        p1.removerQuantidade(90);
        System.out.println("Nome final do produto:  " + p1.getNome());
        System.out.println("Quantidade final: " + p1.getQuantidade());
    }
}
