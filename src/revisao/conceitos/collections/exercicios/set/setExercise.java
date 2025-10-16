package revisao.conceitos.collections.exercicios.set;

import java.util.HashSet;
import java.util.Set;

public class setExercise {
    public static void main(String[] args) {

        //Criar uma colecao Set de inteiros
        Set<Integer> set = new HashSet<>();

        System.out.println(set);

        //Adicionar a colecao
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set);

        //Verifica sem contem esse numero especifico na collection
        System.out.println(set.contains(3));

        set.remove(3);
        System.out.println(set);

        set.add(9);
        System.out.println(set);

        //Limpar toda a colecao
        set.clear();
        System.out.println(set);
    }
}
