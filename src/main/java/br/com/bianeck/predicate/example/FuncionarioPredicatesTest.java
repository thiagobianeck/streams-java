package br.com.bianeck.predicate.example;

import java.util.Arrays;
import java.util.List;

import static br.com.bianeck.predicate.example.FuncionarioPredicates.*;

public class FuncionarioPredicatesTest {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario(1, 23, "M", "Rick", "Beethovan"),
                new Funcionario(2, 13, "F", "Martina", "Hengis"),
                new Funcionario(3, 43, "M", "Ricky", "Martin"),
                new Funcionario(4, 26, "M", "Jon", "Lowman"),
                new Funcionario(5, 19, "F", "Cristine", "Maria"),
                new Funcionario(6, 15, "M", "David", "Feezor"),
                new Funcionario(7, 68, "F", "Melissa", "Roy"),
                new Funcionario(8, 79, "M", "Alex", "Gussin"),
                new Funcionario(9, 15, "F", "Neetu", "Singh"),
                new Funcionario(10, 45, "M", "Naveen", "Jain")
        );

        System.out.println(filterFuncionarios(funcionarios, masculinoEAdulto()));
        System.out.println(filterFuncionarios(funcionarios, femininoEAdulto()));
        System.out.println(filterFuncionarios(funcionarios, idadeMaiorDoQue(35)));
        System.out.println(filterFuncionarios(funcionarios, idadeMaiorDoQue(35).negate()));
    }
}
