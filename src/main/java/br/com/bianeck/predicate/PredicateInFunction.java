package br.com.bianeck.predicate;

import java.util.function.Predicate;

public class PredicateInFunction {

    /**
     *
     * @param numero
     * @param predicate o predicate é passado para fazer a verificacao
     */
    static void pred(int numero, Predicate<Integer> predicate) {
        if(predicate.test(numero))
            System.out.println("Numero: " + numero);
    }

    public static void main(String[] args) {
        pred(10, (i) -> i > 7);
        pred(7, (i) -> i > 7);
        pred(25, (i) -> i > 7);
    }
}
