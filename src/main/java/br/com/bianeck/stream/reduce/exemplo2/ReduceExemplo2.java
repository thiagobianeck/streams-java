package br.com.bianeck.stream.reduce.exemplo2;

import java.util.Arrays;
import java.util.OptionalInt;

public class ReduceExemplo2 {
    public static void main(String[] args) {
        int[] array = {23,43,56,97,32};

        int valorInicial = 100;

        // usando BinaryOperator

        int soma = Arrays.stream(array).reduce(valorInicial, (x, y) -> x + y);
        System.out.println(soma);

        soma = Arrays.stream(array).reduce(valorInicial, Integer::sum);
        System.out.println(soma);

        soma = Arrays.stream(array).reduce(valorInicial, StatisticsUtility::addInData);
        System.out.println(soma);

        int multiplicacao = Arrays.stream(array).reduce(0, StatisticsUtility::multiplyInData);
        System.out.println(multiplicacao);

    }
}
