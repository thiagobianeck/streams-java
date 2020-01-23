package br.com.bianeck.stream.concat;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeUniqueElements {
    public static void main(String[] args) {

        Stream<Integer> primeiroStream = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> segundoStream = Stream.of(4, 5, 6, 7, 8, 9);

        Stream<Integer> resultado = Stream.concat(primeiroStream, segundoStream).distinct();

        String resultadoString = resultado.map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(resultadoString);
    }
}
