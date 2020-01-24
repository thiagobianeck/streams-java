package br.com.bianeck.function;

import java.util.function.Function;

public class Exemplo4 {
    public static void main(String[] args) {
        //FUnction que pega um numero e retorna a metade dele
        Function<Integer, Double> metade = n -> n / 2.0;

        metade = metade.compose(a -> 3 * a);

        System.out.println(metade.apply(5));

    }
}
