package br.com.bianeck.stream.allmatch;

import br.com.bianeck.stream.commons.Estudante;
import br.com.bianeck.stream.enums.Sexo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args) {

        List<Estudante> estudantes = Arrays.asList(
                new Estudante(1L, 25, "José da Silva", Sexo.MASCULINO),
                new Estudante(3L, 30, "Mariana de Souza", Sexo.FEMININO),
                new Estudante(13L, 42, "Eustáquio Gerônimo", Sexo.MASCULINO),
                new Estudante(22L, 47, "Eustanislau Ferreira", Sexo.MASCULINO),
                new Estudante(7L, 27, "Tarso de Pádua", Sexo.MASCULINO),
                new Estudante(4L, 37, "Lucas", Sexo.FEMININO),
                new Estudante(4L, 15, "Zé", Sexo.FEMININO)
        );


        Predicate<Estudante> todosComecamComE =
                estudante -> estudante.getNome().toLowerCase().startsWith("e");
        Predicate<Estudante> todosSaoMaioresDe18 =
                estudante -> estudante.getIdade() >= 18;
        Predicate<Estudante> todosTemMaisDe20ETemMaisDe3Letras =
                estudante -> estudante.getIdade() > 20 && estudante.getNome().length() > 3;

        boolean comecamComE = estudantes.stream().allMatch(todosComecamComE);
        boolean saoMaioresDeIdade = estudantes.stream().allMatch(todosSaoMaioresDe18);
        boolean temMaisDe20ETemMaisDe3Letras = estudantes.stream().allMatch(todosTemMaisDe20ETemMaisDe3Letras);



        System.out.println("Todos os estudantes começam com a letra e? " + (comecamComE ? "SIM" : "NÃO"));
        System.out.println("Todos os estudantes são maiores de idade? " + (saoMaioresDeIdade ? "SIM" : "NÃO"));
        System.out.println("Todos os estudantes tem mais de 20 anos e tem mais de 3 letras no nome? " + (temMaisDe20ETemMaisDe3Letras ? "SIM" : "NÃO"));


    }
}
