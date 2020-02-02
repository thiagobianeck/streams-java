package br.com.bianeck.stream.dropwhile;

import java.util.Arrays;
import java.util.List;

public class DropWhile {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 6, 9, 18, 5, 25, 70, 2, 5, 12, 10);

        integerList.stream().dropWhile(numero -> numero < 50).forEach(System.out::println);

    }
}
