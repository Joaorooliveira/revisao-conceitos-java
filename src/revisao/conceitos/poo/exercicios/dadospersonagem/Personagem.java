package revisao.conceitos.poo.exercicios.dadospersonagem;

public class Personagem {

    private String nome;
    private int nivelDePoder;

    public Personagem(String nome, int nivelDePoder) {
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
    }

    // Getters para podermos ler os valores de fora
    public String getNome() {
        return nome;
    }

    public int getNivelDePoder() {
        return nivelDePoder;
    }

    // Setter para podermos alterar o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome + " | Poder: " + this.nivelDePoder);
    }
}