package br.com.bianeck.stream.concat;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeMultipleStreams {
    public static void main(String[] args) {

        Stream<Integer> primeiro = Stream.of(1, 2);
        Stream<Integer> segundo = Stream.of(3, 4);
        Stream<Integer> terceiro = Stream.of(5, 6);
        Stream<Integer> quarto = Stream.of(7, 8);

        Stream<Integer> resultado = Stream.concat(primeiro, Stream.concat(segundo, Stream.concat(terceiro, quarto)));

        String resultadoString = resultado.map(String::valueOf).collect(Collectors.joining(", "));

        System.out.println(resultadoString);
    }
}
