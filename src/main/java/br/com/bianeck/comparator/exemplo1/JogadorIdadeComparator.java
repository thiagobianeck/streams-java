package br.com.bianeck.comparator.exemplo1;

import java.util.Comparator;

public class JogadorIdadeComparator implements Comparator<Jogador> {

    @Override
    public int compare(Jogador primeiro, Jogador segundo) {
        return (primeiro.getIdade() - segundo.getIdade());
    }


}
