package br.com.bianeck.stream.allmatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Estudante {

    private Long id;
    private Integer idade;
    private String nome;
    private Sexo sexo;

    public Estudante(Long id, Integer idade, String nome, Sexo sexo) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public static List<Estudante> getEstudantes() {
        return Arrays.asList(
            new Estudante(1L, 25, "José da Silva", Sexo.MASCULINO),
            new Estudante(3L, 30, "Mariana de Souza", Sexo.FEMININO),
            new Estudante(13L, 42, "Eustáquio Gerônimo", Sexo.MASCULINO),
            new Estudante(22L, 47, "Eustanislau Ferreira", Sexo.MASCULINO),
            new Estudante(7L, 27, "Tarso de Pádua", Sexo.MASCULINO),
            new Estudante(4L, 37, "Lucas", Sexo.FEMININO)
        );

    }

    @Override
    public String toString() {
        return this.nome;
    }
}
