package revisao.conceitos.poo.exercicios.DadosPersonagem;

public class Main {


    public static void tentarAlterarPoder(int poderDoPersonagem) {
        System.out.println("... Dentro do método: poder recebido = " + poderDoPersonagem);
        poderDoPersonagem = 9000;
        System.out.println("... Dentro do método: poder alterado para = " + poderDoPersonagem);
    }

    public static void alterarNomePeloEndereco(Personagem personagem) {
        System.out.println("... Dentro do método: recebemos o personagem '" + personagem.getNome() + "'");
        // Usamos o endereço para acessar o objeto ORIGINAL e mudar seu nome.
        personagem.setNome("Kakaroto");
        System.out.println("... Dentro do método: nome alterado para '" + personagem.getNome() + "'");
    }


    public static void main(String[] args) {
        Personagem p1 = new Personagem("Goku", 500);

        System.out.println("------ 1. TESTANDO PASSAGEM POR VALOR (PRIMITIVO) ------");
        System.out.println("Poder ORIGINAL antes de chamar o método: " + p1.getNivelDePoder());

        // Criamos uma variável local com o valor do poder.
        // É a CÓPIA desta variável que será enviada.
        int poderAtual = p1.getNivelDePoder();
        tentarAlterarPoder(poderAtual);

        System.out.println("Poder ORIGINAL depois de chamar o método: " + p1.getNivelDePoder());
        System.out.println(">>> CONCLUSÃO: O poder do objeto original NÃO MUDOU! A alteração foi feita na cópia.\n");


        System.out.println("------ 2. TESTANDO PASSAGEM POR REFERÊNCIA (OBJETO) ------");
        System.out.println("Nome ORIGINAL antes de chamar o método: " + p1.getNome());

        alterarNomePeloEndereco(p1);

        System.out.println("Nome ORIGINAL depois de chamar o método: " + p1.getNome());
        System.out.println(">>> CONCLUSÃO: O nome do objeto original MUDOU! A alteração foi feita no objeto original.\n");

        System.out.println("------ Estado final do Personagem ------");
        p1.exibirDados();
    }
}