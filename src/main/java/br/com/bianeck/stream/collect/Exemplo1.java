package br.com.bianeck.stream.collect;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplo1 {
    public static void main(String[] args) {

        List<String> listaDeStrings = Arrays.asList("Java", "C", "C++", "C#", "Go", "Python", "JavaScript", "Scala", "C");

        IntSummaryStatistics estatisticas = listaDeStrings.stream().collect(Collectors.summarizingInt(String::length));
        System.out.println(estatisticas);

        IntSummaryStatistics estaticasInt = Stream.of(1, 3, 78, 999, 45, 32, 40).collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(estaticasInt);

        Map<Boolean, List<Integer>> collect = Stream.of(1, 3, 78, 999, 45, 32, 40).collect(Collectors.partitioningBy(valor -> valor > 50));
        System.out.println("Collect: " + collect.get(true));

        Optional<Integer> max = Stream.of(1, 3, 78, 999, 45, 32, 40).max(Integer::compareTo);
        Optional<Integer> min = Stream.of(1, 3, 78, 999, 45, 32, 40).min(Integer::compareTo);

        DoubleSummaryStatistics estatisticaDouble =
                Stream.of(BigDecimal.TEN, new BigDecimal(20), new BigDecimal(45))
                        .map(BigDecimal::doubleValue)
                        .collect(Collectors.summarizingDouble(Double::valueOf));

        System.out.println("estatisticasDOuble: " + estatisticaDouble);

        // convertendo stream para lista usando o metodo collect
        List<String> listaDeLinguagensQueComecamComJ =
                listaDeStrings.stream()
                        .filter(s -> s.startsWith("J"))
                        .collect(Collectors.toList());

        System.out.println("Lista de linguagens que começam com a letra J: " + listaDeLinguagensQueComecamComJ);

        // convertendo stream para set usando o metodo collect
        Set<String> setDeLinguagensQueComecamComC =
                listaDeStrings.stream()
                        .filter(s -> s.startsWith("C"))
                        .collect(Collectors.toSet());

        System.out.println("Set de linguagens que começam com a letra C: " + setDeLinguagensQueComecamComC);

        //convertendo stream para map
        Map<String, Integer> stringToLength =
                listaDeStrings.stream()
                        .filter(s -> s.length() > 2)
                        .collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println("Mapa de string e seus tamanhos: " + stringToLength);

        //convertendo uma stream para um tipo especifico de lista
        ArrayList<String> stringsComTamanhoMaiorDoQue2 =
                listaDeStrings.stream()
                        .filter(s -> s.length() > 2)
                        .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Collection de string com tamanho maior do que 2: " + stringsComTamanhoMaiorDoQue2);

        //Juntando elementos
        String meuNome = Stream.of("Thiago", "Moreira", "bianeck")
                .collect(Collectors.joining(" ", "( "," )"));
        System.out.println(meuNome);

        List<String> listaMutavel = Stream.of("Thiago", "Moreira", "bianeck").collect(Collectors.toList());
        System.out.println("antes (listaMutavel)" + listaMutavel);
        listaMutavel.set(1, "Norris");
        System.out.println("depois (listaMutavel)" + listaMutavel);

        //criando uma lista imutável
        List<String> listaImutavel = Stream.of("Thiago", "Moreira", "bianeck").collect(Collectors.collectingAndThen(Collectors.toList(), List::copyOf));
        System.out.println("antes (listaImutavel)" + listaImutavel);
        listaImutavel.set(1, "Norris");
        System.out.println("depois (listaImutavel)" + listaImutavel);
    }
}
