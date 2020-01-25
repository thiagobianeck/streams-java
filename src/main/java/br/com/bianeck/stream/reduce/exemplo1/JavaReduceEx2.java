package br.com.bianeck.stream.reduce.exemplo1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JavaReduceEx2 {
    public static void main(String[] args) {

        List<Carro> pessoas = Arrays.asList(
                new Carro("Skoda", 18544),
                new Carro("Volvo", 22344),
                new Carro("Fiat", 23650),
                new Carro("Renault", 19700)
        );
        Optional<Carro> carro = pessoas.stream().reduce(((carro1, carro2) ->
                carro1.getPreco() > carro2.getPreco() ? carro1 : carro2));

        carro.ifPresent(System.out::println);
    }
}
