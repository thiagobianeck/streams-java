package br.com.bianeck.stream.builder;

import java.util.stream.Stream;

public class Exemplo2 {
    public static void main(String[] args) {

        Stream.Builder<String> builder = Stream.builder();

        Stream<String> stream =
                builder
                        .add("Thiago")
                        .add("Moreira")
                        .add("Bianeck")
                        .build();

        stream.forEach(System.out::println);
    }
}
