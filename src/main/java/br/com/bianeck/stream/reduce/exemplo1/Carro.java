package br.com.bianeck.stream.reduce.exemplo1;

public class Carro {

    private final String nome;
    private final int preco;

    public Carro(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Carro{nome= ").append(nome).append(", preço= ").append(preco).append("}");
        return builder.toString();
    }
}
