package br.com.bianeck.predicate.example;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FuncionarioPredicates {

    public static Predicate<Funcionario> masculinoEAdulto() {
        return p -> p.getIdade() > 21 && p.getSexo().equalsIgnoreCase("M");
    }

    public static Predicate<Funcionario> femininoEAdulto() {
        return p -> p.getIdade() > 18 && p.getSexo().equalsIgnoreCase("F");
    }

    public static Predicate<Funcionario> idadeMaiorDoQue(Integer idade) {
        return p -> p.getIdade() > idade;
    }

    public static List<Funcionario> filterFuncionarios (List<Funcionario> funcionarios, Predicate<Funcionario> predicate) {
        return funcionarios.stream()
                .filter(predicate)
                .collect(Collectors.<Funcionario>toList());
    }
}
