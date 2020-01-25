package br.com.bianeck.stream.reduce.exemplo2;

import java.util.stream.Stream;

public class ReduceExemplo6 {
    public static void main(String[] args) {
        Integer i = Stream.of("2", "3", "4", "5")
                .parallel()
                .reduce(0,
                        (integer, s) -> Integer.sum(integer, Integer.parseInt(s)),
                        (integer, integer2) -> Integer.sum(integer, integer));

        System.out.println(i);


    }
}
