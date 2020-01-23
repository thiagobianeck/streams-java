package br.com.bianeck.stream.builder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplo3 {
    public static void main(String[] args) {

        Stream.Builder<String> builder = Stream.builder();

        Stream<String> stream =
                builder
                        .add("APRENDENDO")
                        .add("STREAMS")
                        .add("EM JAVA")
                        .build();

        List<String> lista = stream.map(String::toLowerCase).collect(Collectors.toList());

        System.out.println(String.join(" ", lista));
    }
}
