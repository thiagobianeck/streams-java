package br.com.bianeck.stream.reduce.exemplo2;

import java.util.Arrays;

public class ReduceExemplo1 {
    public static void main(String[] args) {
        int[] array = {23,43,56,97,32};
        Arrays.stream(array).reduce((x, y) -> x + y).ifPresent(System.out::println);
        Arrays.stream(array).reduce(Integer::sum).ifPresent(System.out::println);
        Arrays.stream(array).reduce(StatisticsUtility::addInData).ifPresent(System.out::println);
        Arrays.stream(array).reduce(StatisticsUtility::multiplyInData).ifPresent(System.out::println);
    }
}
