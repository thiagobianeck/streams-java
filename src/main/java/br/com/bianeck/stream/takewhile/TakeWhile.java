package br.com.bianeck.stream.takewhile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TakeWhile {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 6, 9, 18, 5, 25, 70, 2, 5, 12, 10);

        integerList.stream().takeWhile(numero -> numero < 50).forEach(System.out::println);

        // Three args
        IntStream.iterate(0, y -> y < 9, x -> x + 1).forEach(System.out::println);

    }
}
