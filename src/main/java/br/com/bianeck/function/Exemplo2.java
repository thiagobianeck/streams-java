package br.com.bianeck.function;

import java.util.function.Function;

public class Exemplo2 {
    public static void main(String[] args) {
        //FUnction que pega um numero e retorna a metade dele
        Function<Integer, Double> metade = n -> n / 2.0;


        System.out.println(metade.andThen(n -> n + 4.5).andThen(n -> n * 3).apply(27));
    }
}
