package br.com.bianeck.stream.reduce.exemplo2;

import java.util.Arrays;
import java.util.List;

public class ReduceExemplo5 {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four"};
        String result = Arrays.stream(array)
                .reduce("",
                        (s, s2) -> s + "-" + s2,
                        (s, s2) -> s + "|" + s2);
        System.out.println(result);

        result = Arrays.stream(array).parallel()
                .reduce("",
                        (s, s2) -> s + "-" + s2,
                        (s, s2) -> s + "|" + s2);
        System.out.println(result);




    }
}
