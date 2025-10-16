package revisao.conceitos.abstractt.exercicios.loja;// package revisao.conceitos.abstractt.loja;

public class LojaComercial extends Loja {

    public LojaComercial(int cnpj, String razaoSocial) {
        super(cnpj, razaoSocial);
    }

    @Override
    public void abrir() {
        // Lógica para mudar o estado para "aberta"
        if (!this.aberta) {
            this.aberta = true;
            System.out.println("A loja foi aberta.");
        } else {
            System.out.println("A loja já está aberta.");
        }
    }

    @Override
    public void fechar() {
        // Lógica para mudar o estado para "fechada"
        if (this.aberta) {
            this.aberta = false;
            System.out.println("A loja foi fechada.");
        } else {
            System.out.println("A loja já está fechada.");
        }
    }
}