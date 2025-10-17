package revisao.conceitos.exceptions.exercicios.nullpointerexceptioninteger;

public class ExemploNullPointerExceptionInteger {
    public static Integer numero =null;
    public static void main(String[] args) {


        try{
            System.out.println(numero.toString());
        }catch(NullPointerException e){
            System.out.println("Erro pois esta nulo");
            System.out.println("Erro: "+e.getMessage());
        }
//        ExemploNullPointerExceptionInteger obj = new ExemploNullPointerExceptionInteger();
//        System.out.println("Obj: "+obj.numero.toString());
    }
}
