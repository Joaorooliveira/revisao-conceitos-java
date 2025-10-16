package revisao.conceitos.abstractt.exercicios.loja;// package revisao.conceitos.abstractt.loja;

public abstract class Loja {
    private int cnpj;
    private String razaoSocial;
    protected boolean aberta;

    public Loja(int cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false; // Toda loja começa fechada.
    }

    public abstract void abrir();
    public abstract void fechar();
}