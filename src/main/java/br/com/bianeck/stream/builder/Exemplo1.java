package br.com.bianeck.stream.builder;

import java.util.stream.Stream;

public class Exemplo1 {

    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.builder();

        Stream<String> stream = builder.add("Maçã").add("Pera").build();

        stream.forEach(System.out::println);
    }
}
