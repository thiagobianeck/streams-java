package br.com.bianeck.function;

import java.util.function.Function;

public class Exemplo3 {
    public static void main(String[] args) {
        //FUnction que pega um numero e retorna a metade dele
        Function<Integer, Double> metade = n -> n / 2.0;

        try {
            metade = metade.andThen(null);
        } catch (Exception e) {
            System.out.println("Exception lançada");
        }
    }
}
