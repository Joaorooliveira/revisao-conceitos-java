package revisao.conceitos.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface OperacoesMatematicas{
    int calcular(int a,int b);
}
interface Operacoesmatematicas2{
    void calcular(int a,int b);
}
public class Main {
    public static void main(String[] args) {
        //Sem Lambdas
        OperacoesMatematicas soma = new OperacoesMatematicas() {
            @Override
            public int calcular(int a, int b) {
                return a+b;
            }
        };

        System.out.println(soma.calcular(10,20));
        //com lambda
        OperacoesMatematicas som2 = (a,b) -> a+b;
        System.out.println(som2.calcular(20,30));
        //outro jeito
        OperacoesMatematicas som3 = (a,b) -> {
            return a+b;
        };
        //outro jeito com o metodo como (void)
        Operacoesmatematicas2 som4 = (a,b) -> {
            System.out.println("A soma e : "+(a+b));
        };
        som4.calcular(10,20);

        //Filtragem de palavras em uma list sem Lambdas
        List<String> palavras =  Arrays.asList("Dota","javanauta","joao victor","lol");
        List<String> palavrasFiltradas= new ArrayList<>();
        for (String palavra : palavras) {
            if(palavra.length()>4){
                palavrasFiltradas.add(palavra);
            }
        }
        System.out.println(palavrasFiltradas);

        //Filtragem de palavras em uma list com Lambdas

        List<String> palavras2 = palavras.stream().filter(s -> s.length()>5).toList();
        palavras2.forEach(System.out::println);
    }
}
