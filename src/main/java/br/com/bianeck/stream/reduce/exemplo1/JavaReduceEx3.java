package br.com.bianeck.stream.reduce.exemplo1;

import java.util.stream.IntStream;

public class JavaReduceEx3 {
    public static void main(String[] args) {

        IntStream.range(1, 10).reduce((x,y) -> x + y)
                .ifPresent(System.out::println);

        IntStream.range(1, 10).reduce(Integer::sum)
                .ifPresent(System.out::println);

        IntStream.range(1, 10).reduce(MyUtil::add2Ints)
                .ifPresent(System.out::println);

    }
}
