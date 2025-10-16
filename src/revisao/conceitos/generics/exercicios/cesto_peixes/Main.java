package revisao.conceitos.generics.exercicios.cesto_peixes;

public class Main {
    public static void main(String[] args) {
        Cesto <Peixe> peixe = new Cesto <>();
        Cesto <Polvo> polvo = new Cesto <>();

        peixe.guardar(new Peixe("Bolha",2));
        System.out.println(peixe.pegar());
    }
}
