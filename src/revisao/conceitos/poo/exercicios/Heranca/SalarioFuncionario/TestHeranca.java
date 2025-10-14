package revisao.conceitos.poo.exercicios.Heranca.SalarioFuncionario;

public class TestHeranca {
    public static void main(String[] args) {
        Assistente assistente = new Assistente("Joao",3000);

        assistente.addAumento(500);
        System.out.println("Nome: "+assistente.getNome());
        System.out.println("Salario anual: "+assistente.ganhoAnual());



    }
}
