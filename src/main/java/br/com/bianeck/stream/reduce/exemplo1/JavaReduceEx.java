package br.com.bianeck.stream.reduce.exemplo1;

import java.util.Arrays;

public class JavaReduceEx {
    public static void main(String[] args) {

        int vals[] = new int[]{2, 4, 6, 8, 10, 12, 14, 16};

        int sum = Arrays.stream(vals).sum();
        System.out.printf("A Soma dos valores e: %d%n", sum);

        long n = Arrays.stream(vals).count();
        System.out.printf("O Numero de valores e: %d%n", n);

    }
}
