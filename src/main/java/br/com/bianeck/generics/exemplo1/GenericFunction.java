package br.com.bianeck.generics.exemplo1;

public class GenericFunction {

    static <T> void genericDisplay(T elemento) {
        System.out.println(elemento.getClass().getName() + " = " + elemento);
    }

    public static void main(String[] args) {

        // chamando métodos genéricos com argumento inteiro
        genericDisplay(11);
        // chamando métodos genéricos com argumento String
        genericDisplay("Bianeck");
        // chamando métodos genéricos com argumento Double
        genericDisplay(1.2);
        // chamando métodos genéricos com argumento Long
        genericDisplay(27l);
        genericDisplay(27L);

    }
}
