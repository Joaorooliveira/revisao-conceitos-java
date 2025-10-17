package revisao.conceitos.collections.exercicios.map.estoque;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<Integer, Integer> estoque = new HashMap<>();

        //Adiciona ao Map(estoque)
        estoque.put(1, 15);
        estoque.put(2, 5);
        System.out.println(estoque);
        //Busca o valor pelo codigo

        System.out.println(estoque.get(1));

        //Remove um "produto" pelo codigo
        estoque.remove(2);
        System.out.println(estoque);


    }
}
