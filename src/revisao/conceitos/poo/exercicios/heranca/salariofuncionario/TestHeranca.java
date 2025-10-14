package revisao.conceitos.poo.exercicios.heranca.salariofuncionario;

public class TestHeranca {
    public static void main(String[] args) {
        Assistente assistente = new Assistente("Joao",3000);

        assistente.addAumento(500);
        System.out.println("Nome: "+assistente.getNome());
        System.out.println("Salario anual: "+assistente.ganhoAnual());



    }
}
