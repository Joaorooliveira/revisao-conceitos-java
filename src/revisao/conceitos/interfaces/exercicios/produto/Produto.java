package revisao.conceitos.interfaces.exercicios.produto;

public interface Produto {
    void adicionarQuantidade(int quantidade);

    void removerQuantidade(int quantidade);

    String getNome(); // Um getter geralmente retorna o valor

    int getQuantidade(); // Um getter geralmente retorna o valor

}
