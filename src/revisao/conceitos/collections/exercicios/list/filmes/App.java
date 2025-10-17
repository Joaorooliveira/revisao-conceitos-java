package revisao.conceitos.collections.exercicios.list.filmes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> filmes = new ArrayList();

        filmes.add("O poderoso chefao");
        filmes.add("Duna");
        filmes.add("Perfect Days");

        System.out.println(filmes);

        System.out.println(filmes.contains("Duna"));

        filmes.remove("Perfect Days");
        System.out.println(filmes);

        LinkedList<String> filmes2 = new LinkedList<>();

        filmes2.add("O poderoso chefao");
        filmes2.add("Duna");
        filmes2.add("Perfect Days");
        System.out.println(filmes2);


    }
}
