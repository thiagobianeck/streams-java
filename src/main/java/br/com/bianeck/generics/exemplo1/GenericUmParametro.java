package br.com.bianeck.generics.exemplo1;

public class GenericUmParametro<T> {

    private T objeto;

    public GenericUmParametro(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public static void main(String[] args) {

        GenericUmParametro<Integer> integerObjeto =
                new GenericUmParametro<>(27);

        System.out.println(integerObjeto.getObjeto());

        GenericUmParametro<String> stringObjeto =
                new GenericUmParametro<String>("Thiago Bianeck");
        System.out.println(stringObjeto.getObjeto());

    }
}
