package br.com.bianeck.stream.reduce.exemplo2;

import java.util.Arrays;
import java.util.List;

public class ReduceExemplo3 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(5,6,7);
        int res = lista.parallelStream().reduce(
                1,
                (s1, s2) -> s1 * s2,
                (p, q) -> p * q
        );
        System.out.println(res);

    }
}
