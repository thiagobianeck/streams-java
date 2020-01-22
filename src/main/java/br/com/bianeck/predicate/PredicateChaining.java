package br.com.bianeck.predicate;

import java.util.function.Predicate;

//encadeamento de predicates
public class PredicateChaining {

    public static void main(String[] args) {

        Predicate<Integer> maiorDoQue10 = (i) -> i > 10;

        //criando o predicate
        Predicate<Integer> menorDoQue20 = (i) -> i < 20;
        // faz o encadeamento das duas predicates e verifica primeiro se o numero
        // é maior do que dez e depois se é menor do que 20
        boolean resultado1 = maiorDoQue10.and(menorDoQue20).test(15);
        boolean resultado2 = maiorDoQue10.and(menorDoQue20).test(7);
        boolean resultado3 = maiorDoQue10.and(menorDoQue20).test(21);
        boolean resultado4 = maiorDoQue10.and(menorDoQue20).test(10);
        boolean resultado5 = maiorDoQue10.and(menorDoQue20).test(20);

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        System.out.println(resultado5);


        //usando o negate eu posso inverter o resultado
        boolean resultado6 = maiorDoQue10.and(menorDoQue20).negate().test(15);
        System.out.println(resultado6);
    }



}
