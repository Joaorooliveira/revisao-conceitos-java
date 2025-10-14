package revisao.conceitos.poo.exercicios.saladeaula;

public class TesteSalaDeAula {
    public static void main(String[] args) {
        System.out.println("Iniciando a chamada...");

        // Criando a primeira instância. O construtor será chamado e o contador irá para 1.
        SalaDeAula aluno1 = new SalaDeAula();
        SalaDeAula.exibirNumeroTotalAlunos(); // Saída: 1

        // Criando a segunda instância. O contador (que é compartilhado) irá para 2.
        SalaDeAula aluno2 = new SalaDeAula();
        SalaDeAula.exibirNumeroTotalAlunos(); // Saída: 2

        // Criando a terceira instância. O contador irá para 3.
        SalaDeAula aluno3 = new SalaDeAula();

        // Exibindo o total final.
        System.out.println("\n--- Contagem Final ---");
        SalaDeAula.exibirNumeroTotalAlunos(); // Saída: 3
    }
}