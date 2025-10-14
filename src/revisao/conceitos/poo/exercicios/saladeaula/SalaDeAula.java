package revisao.conceitos.poo.exercicios.saladeaula;

public class SalaDeAula {

    // A variável estática pertence à classe, não a um objeto específico.
    public static int numeroTotalAlunos = 0;

    // Este é o construtor. Ele é chamado toda vez que um novo objeto é criado.
    // Faz sentido que a contagem de alunos aumente aqui.
    public SalaDeAula() {
        numeroTotalAlunos++;
        System.out.println("Um novo aluno entrou na sala.");
    }

    // O método para exibir a contagem continua estático.
    public static void exibirNumeroTotalAlunos(){
        System.out.println("Numero total de alunos na sala agora: " + numeroTotalAlunos);
    }
}