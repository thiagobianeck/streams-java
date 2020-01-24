package br.com.bianeck.comparator.exemplo1;

import java.util.Comparator;

public class JogadorRankingComparator implements Comparator<Jogador> {

    @Override
    public int compare(Jogador primeiro, Jogador segundo) {
        return (primeiro.getRanking() - segundo.getRanking());
    }


}
