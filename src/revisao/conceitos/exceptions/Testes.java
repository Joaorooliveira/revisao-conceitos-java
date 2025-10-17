package revisao.conceitos.exceptions;

public class Testes {
    public static void main(String[] args) {
        System.out.println("Olá, mundo da revisão de Java!");
        //String nome = JOptionPane.showInputDialog("Digite seu nome: ");

        int a =0;
        int b = 0;
        try {
            int divisao = a / b;
            System.out.println(divisao);
        }catch(ArithmeticException e) {
            System.out.println("Erro: "+e.getMessage());
            //System.out.println("Nao pode dividir por zero!");
        }
        String nome = null;


        try {
            int tamanhoNome = nome.length();// Tentando acessar objeto nulo
            System.out.println("Tamanho do nome: " + tamanhoNome);
        } catch (NullPointerException e) {
            System.out.println("Erro: A variável 'nome' está nula!");
        } finally {
            System.out.println("Sempre execute o bloco finally!");
        }

        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Sempre será executado!");
        }
    }
}
