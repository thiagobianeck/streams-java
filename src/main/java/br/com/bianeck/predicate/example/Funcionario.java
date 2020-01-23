package br.com.bianeck.predicate.example;

public class Funcionario {

    private Integer id;
    private Integer idade;
    private String sexo;
    private String nome;
    private String sobrenome;

    public Funcionario(Integer id, Integer idade, String sexo, String nome, String sobrenome) {
        this.id = id;
        this.idade = idade;
        this.sexo = sexo;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return this.id.toString() + " - " + this.nome + " - " + this.idade.toString() + " anos";
    }
}
