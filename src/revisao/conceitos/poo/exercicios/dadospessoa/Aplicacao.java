package revisao.conceitos.poo.exercicios.dadospessoa;

public class Aplicacao {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Joao";
        p1.setIdade(25);
        p1.setEndereco("Qnl 20 bloco f apt 50");
        p1.setTelefone(618176526);

        Pessoa p2 = new Pessoa();
        p2.nome = "Maria";
        p2.setIdade(30);
        p2.setEndereco("Qnl 30 bloco D apt 12");
        p2.setTelefone(618321321);

        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: "+p1.getIdade());
        System.out.println("Endereco :"+p1.getEndereco());
        System.out.println("Telefone :"+p1.getTelefone());
        System.out.println("--------------------------------------");
        System.out.println("Nome: " + p2.nome);
        System.out.println("Idade: "+p2.getIdade());
        System.out.println("Endereco :"+p2.getEndereco());
        System.out.println("Telefone :"+p2.getTelefone());

        /*p1.exibirPessoa();
        p2.exibirPessoa();*/

    }
}
