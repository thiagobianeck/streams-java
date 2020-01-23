package br.com.bianeck.stream.anymatch;

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

        Predicate<Estudante> algumComecaComE =
                estudante -> estudante.getNome().toLowerCase().startsWith("e");
        Predicate<Estudante> algumEMaiorDe18 =
                estudante -> estudante.getIdade() >= 18;
        Predicate<Estudante> algumTemMaisDe20ETemMaisDe3Letras =
                estudante -> estudante.getIdade() > 20 && estudante.getNome().length() > 3;
        Predicate<Estudante> algumTemMenosDe20ETemMenosDe3Letras =
                estudante -> estudante.getIdade() < 20 && estudante.getNome().length() < 3;

        boolean comecamComE = estudantes.stream().anyMatch(algumComecaComE);
        boolean saoMaioresDeIdade = estudantes.stream().anyMatch(algumEMaiorDe18);
        boolean temMaisDe20ETemMaisDe3Letras = estudantes.stream().anyMatch(algumTemMaisDe20ETemMaisDe3Letras);
        boolean temMenosDe20ETemMenosDe3Letras = estudantes.stream().anyMatch(algumTemMenosDe20ETemMenosDe3Letras);



        System.out.println("Algum estudante começa com a letra e? " + (comecamComE ? "SIM" : "NÃO"));
        System.out.println("Algum estudantes é maior de idade? " + (saoMaioresDeIdade ? "SIM" : "NÃO"));
        System.out.println("Algum estudante tem mais de 20 anos e tem mais de 3 letras no nome? " + (temMaisDe20ETemMaisDe3Letras ? "SIM" : "NÃO"));
        System.out.println("Algum estudante tem menos de 20 anos e tem menos de 3 letras no nome? " + (temMenosDe20ETemMenosDe3Letras ? "SIM" : "NÃO"));


    }
}
