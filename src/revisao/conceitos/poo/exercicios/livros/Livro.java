package revisao.conceitos.poo.exercicios.livros;

public class Livro {
    public String titulo;
    private String autor;
    protected int anoPublicacao;
    float preco;

    public Livro() {
    }

    public Livro(String titulo, String autor, int anoPublicacao, float preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public void exibirLivro(){
        System.out.println("------------------------------------");
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Ano de publicacao: "+anoPublicacao);
        System.out.println("Preco: "+preco);
    }
}
