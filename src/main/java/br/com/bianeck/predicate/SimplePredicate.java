package br.com.bianeck.predicate;

import java.util.function.Predicate;

public class SimplePredicate {

    public static void main(String[] args) {

        //criando o predicate
        // verifica se o inteiro "i" passado é menor do que 18
        Predicate<Integer> menorQue18 = i -> (i < 18);

        //chamando o metodo do predicate
        // o test do predicate faz o test no predicate e retorna true ou false
        System.out.println(menorQue18.test(10));
        System.out.println(menorQue18.test(19));
    }
}
