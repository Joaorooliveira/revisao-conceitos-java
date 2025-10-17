package revisao.conceitos.lambdas.exercicios.impares;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.removeIf(numero -> numero % 2 == 0);
        System.out.println("Numeros impares: "+numeros);




    }
}
