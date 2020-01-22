package br.com.bianeck.predicate;

import java.util.function.Predicate;

public class PredicateNegate {

    public static Predicate<String> temTamanho10 = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length() > 10;
        }
    };

    public static void predicate_negate() {
        String tamanhoMaiorDoQue10 = "Ola eu sou uma string que tem mais de 10 caracteres";

        boolean saida = temTamanho10.negate().test(tamanhoMaiorDoQue10);
        System.out.println(saida);
    }

    public static void main(String[] args) {
        predicate_negate();
    }
}
