package br.com.bianeck.stream.commons;

import br.com.bianeck.stream.enums.Sexo;

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

    @Override
    public String toString() {
        return this.nome;
    }
}
