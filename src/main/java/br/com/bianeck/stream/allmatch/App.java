package br.com.bianeck.stream.allmatch;

import java.util.List;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args) {

        List<Estudante> estudantes = Estudante.getEstudantes();

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
