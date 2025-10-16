package revisao.conceitos.generics.exercicios.cesto_peixes;

public class  Cesto<T> {
    private T conteudo;
    
    public void guardar(T conteudo){
        this.conteudo = conteudo;
    }
    
    public T pegar(){
        return conteudo;
    }


}
