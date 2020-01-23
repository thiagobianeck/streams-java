package br.com.bianeck.stream.concat;

import br.com.bianeck.stream.commons.Funcionario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeCustomObjects {
    public static void main(String[] args) {
        Stream<Funcionario> stream1 = getFuncionariosListaUm().stream();
        Stream<Funcionario> stream2 = getFuncionariosListaDois().stream();

        Stream<Funcionario> resultado = Stream.concat(stream1, stream2).filter(distinctByKey(Funcionario::getNome));

        String resultadoString = resultado.map(Funcionario::getNome).collect(Collectors.joining(", "));
        System.out.println(resultadoString);

    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> chaveExtr) {
        ConcurrentHashMap<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(chaveExtr.apply(t), Boolean.TRUE) == null;
    }

    private static ArrayList<Funcionario> getFuncionariosListaUm() {
        return new ArrayList<>(
                Arrays.asList(
                        new Funcionario(1L, 35, "M", "Thiago", "Bianeck"),
                        new Funcionario(2L, 28, "M", "Leon", "Bianeck"),
                        new Funcionario(3L, 7, "M", "Lunna Maitê", "Bianeck"),
                        new Funcionario(4L, 13, "M", "Roger Logan", "Bianeck"),
                        new Funcionario(5L, 10, "M", "Maria Clara Isis", "Bianeck")
                )
        );

    }

    private static ArrayList<Funcionario> getFuncionariosListaDois() {
        return new ArrayList<>(
                Arrays.asList(
                        new Funcionario(3L, 7, "M", "Lunna Maitê", "Bianeck"),
                        new Funcionario(5L, 10, "M", "Maria Clara Isis", "Bianeck")
                )
        );

    }
}
