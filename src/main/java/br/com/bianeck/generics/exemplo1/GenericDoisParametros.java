package br.com.bianeck.generics.exemplo1;

public class GenericDoisParametros<T, U> {

    private T objetoT;
    private U objetoU;

    public GenericDoisParametros(T objetoT, U objetoU) {
        this.objetoT = objetoT;
        this.objetoU = objetoU;
    }

   public void print() {
       System.out.println(objetoT);
       System.out.println(objetoU);
   }

    public static void main(String[] args) {

        GenericDoisParametros<String, Integer> doisParametros =
                new GenericDoisParametros<String, Integer>("Bianeck", 27);

        doisParametros.print();
    }
}
