package revisao.conceitos.poo.exercicios.DadosFuncionario;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        Funcionario funcionario1 = new Funcionario("Joao","Desenvolvedor",25);
        Funcionario funcionario2 = new Funcionario("Maria","Gerente",30);
        Funcionario funcionario3 = new Funcionario();

        //funcionario1.nome = "Joao";
        //funcionario1.idade = 25;
        //funcionario1.cargo = "Desenvolvedor Java";

        funcionario3.nome = "Jose";
        funcionario3.idade = 60;
        funcionario3.cargo = "Dono";

        System.out.println("Funcionario :"+funcionario1.nome+
                "\nIdade: "+funcionario1.idade+
                "\nCargo: "+funcionario1.cargo);
        System.out.println("------------------------------------");
        System.out.println("Funcionario 2 :"+funcionario2.nome+
                "\nIdade: "+funcionario2.idade+
                "\nCargo: "+funcionario2.cargo);
        System.out.println("------------------------------------");
        System.out.println("Funcionario 3 :"+funcionario3.nome+
                "\nIdade: "+funcionario3.idade+
                "\nCargo: "+funcionario3.cargo);
    }



}
