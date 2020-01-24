package br.com.bianeck.comparator.exemplo1;

public class Jogador implements Comparable<Jogador>{

    private int ranking;
    private String nome;
    private int idade;

    public Jogador(int ranking, String nome, int idade) {
        this.ranking = ranking;
        this.nome = nome;
        this.idade = idade;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Jogador o) {
        return (this.getRanking() - o.getRanking());
    }

    @Override
    public String toString() {
        return "[ Ranking: "+ ranking +", Nome: " + nome + ", Idade: " + idade + " ]";
    }
}
