package br.com.bianeck.comparator.exemplo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JogadorSorter {
    public static void main(String[] args) {
        List<Jogador> timeDeFutebol = new ArrayList<>();
        Jogador jogador1 = new Jogador(100, "Thiago", 35);
        Jogador jogador2 = new Jogador(80, "Diego", 37);
        Jogador jogador3 = new Jogador(88, "Leon", 29);

        timeDeFutebol.add(jogador1);
        timeDeFutebol.add(jogador2);
        timeDeFutebol.add(jogador3);

        System.out.println("Antes de organizar: " + timeDeFutebol);
        Collections.sort(timeDeFutebol);
        System.out.println("Depois de organizar: " + timeDeFutebol + "\n");


        System.out.println("Antes de organizar pelo Ranking: " + timeDeFutebol);

        Comparator<Jogador> peloRanking = (Jogador jogadorUm, Jogador jogadorDois) -> jogador1.getRanking() - jogador2.getRanking();
        Comparator<Jogador> peloRanking2 = Comparator.comparing(Jogador::getRanking);
        Comparator<Jogador> pelaIdade = Comparator.comparing(Jogador::getIdade);

//        JogadorRankingComparator jogadorRankingComparator = new JogadorRankingComparator();
        timeDeFutebol.sort(peloRanking2);
        System.out.println("Depois de organizar pelo Ranking: " + timeDeFutebol+ "\n");

        System.out.println("Antes de organizar pela Idade: " + timeDeFutebol);
//        JogadorIdadeComparator jogadorIdadeComparator = new JogadorIdadeComparator();
        timeDeFutebol.sort(pelaIdade);
        System.out.println("Depois de organizar pela Idade: " + timeDeFutebol + "\n");
    }
}
