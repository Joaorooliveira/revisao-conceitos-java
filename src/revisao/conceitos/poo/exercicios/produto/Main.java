package revisao.conceitos.poo.exercicios.produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Cadeira",50.70f,1);
        Produto produto2 = new Produto("Mesa",90.99f,2);
        Produto produto3 = new Produto("Sofa",575.99f,3);

        produto1.exibirProduto();
        produto2.exibirProduto();
        produto3.exibirProduto();
    }
}
