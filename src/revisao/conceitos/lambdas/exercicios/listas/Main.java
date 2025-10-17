package revisao.conceitos.lambdas.exercicios.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> minhaLista = new ArrayList<>();
        minhaLista.add("Maca");
        minhaLista.add("Banana");
        minhaLista.add("Cereja");
        minhaLista.add("Abacaxi");

        minhaLista.removeIf(s -> s.length()>5);
        minhaLista.forEach(System.out::println);

        minhaLista.add(0,"Uva");
        minhaLista.forEach(System.out::println);
    }
}
