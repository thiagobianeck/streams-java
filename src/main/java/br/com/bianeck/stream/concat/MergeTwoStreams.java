package br.com.bianeck.stream.concat;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class MergeTwoStreams {
    public static void main(String[] args) {

        Stream<Integer> primeiroStream = Stream.of(1, 2, 3);
        Stream<Integer> segundoStream = Stream.of(4, 5, 6);

        Stream<Integer> resultado = Stream.concat(primeiroStream, segundoStream);

        System.out.println(resultado.map(String::valueOf).collect(joining(", ")));
    }
}
