package revisao.conceitos.poo.exercicios.livros;

public class Aplicacao {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        Livro livro2 = new Livro("A hora da estrela","Clarice Lispector");
        Livro livro3 = new Livro("Vidas Secas","Graciliano Ramos",2000,53.99f);

        livro1.exibirLivro();
        livro2.exibirLivro();
        livro3.exibirLivro();
    }
}
