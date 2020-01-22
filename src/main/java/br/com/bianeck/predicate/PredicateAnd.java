package br.com.bianeck.predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateAnd {

    public static Predicate<String> temTamanho10 = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length() > 10;
        }
    };

    public static void predicate_and() {
        Predicate<String> predicateNaoNulo = Objects::nonNull;

        String nullString = null;

        boolean saida = predicateNaoNulo.and(temTamanho10).test(nullString);
        System.out.println(saida);

        String tamanhoMaiorDoQue10 = "Seja Bem vindo à matrix";
        boolean saida2 = predicateNaoNulo.and(temTamanho10).test(tamanhoMaiorDoQue10);
        System.out.println(saida2);
    }

    public static void main(String[] args) {
        predicate_and();
    }
}
