package br.com.bianeck.stream.distinct;

import java.util.Arrays;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {

        Arrays.asList(1, 7, 9, 1, 5, 25, 70, 2, 5, 7, 5)
                .stream().distinct().forEach(System.out::println);

        Arrays.asList("Thiago", "João", "Maria", "Thiago", "Roger", "Thiago")
                .stream().distinct().forEach(System.out::println);

    }
}
