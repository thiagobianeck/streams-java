package br.com.bianeck.predicate;

import java.util.function.Predicate;

public class PredicateOr {

    public static Predicate<String> temTamanho10 = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length() > 10;
        }
    };

    public static void predicate_or() {
        Predicate<String> contemALetraA = l -> l.contains("A");
        String contemA = "And";

        boolean saida = temTamanho10.or(contemALetraA).test(contemA);
        System.out.println(saida);
    }

    public static void main(String[] args) {
        predicate_or();
    }
}
