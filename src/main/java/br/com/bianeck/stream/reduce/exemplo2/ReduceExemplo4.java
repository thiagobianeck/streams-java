package br.com.bianeck.stream.reduce.exemplo2;

import java.util.Arrays;
import java.util.List;

public class ReduceExemplo4 {
    public static void main(String[] args) {
        String[] array = {"Mohan", "Sohan", "Mahessh"};

        Arrays.stream(array).reduce((x, y) -> x + "," + y)
                .ifPresent(s -> System.out.println("Array para String: " + s));

        List<String> lista = Arrays.asList("Mohan", "Sohan", "Mahessh");
        lista.stream().reduce((x, y) -> x + "," + y)
                .ifPresent(s -> System.out.println("Lista para String: " + s));

    }
}
