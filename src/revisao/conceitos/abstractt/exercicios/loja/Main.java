package revisao.conceitos.abstractt.exercicios.loja;// package revisao.conceitos.abstractt.loja;

public class Main {
    public static void main(String[] args) {
        LojaComercial loja = new LojaComercial(123,"LOL");


        // 2. Tenta abrir a loja
        loja.abrir();

        // 3. Tenta abrir de novo
        loja.abrir(); // Deve avisar que já está aberta

        // 4. Fecha a loja
        loja.fechar();
    }
}