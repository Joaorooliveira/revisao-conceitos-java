package revisao.conceitos.poo.exercicios.produto;

public class Produto {

    private String nome;
    private float preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, float preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirProduto(){
        System.out.println("----------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade: " + quantidadeEmEstoque);
    }
}
