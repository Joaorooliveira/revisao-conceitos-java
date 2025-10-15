package revisao.conceitos.poo.exercicios.heranca.estudante;

public class Estudante extends Pessoa{
    private int matricula;

    public Estudante(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
    public void exibirDetalhes(){
        System.out.println("Nome: "+ getNome() +
                "\nIdade: "+getIdade()+
                "\nMatricula: "+matricula);
    }
}
