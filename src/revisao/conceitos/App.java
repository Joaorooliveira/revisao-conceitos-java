package revisao.conceitos;

import javax.swing.*;

public class App {
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
    }
}