package aplicacao;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import xadrez.PartidaDeXadrez;

public class Programa {
    public static void main(String[] args) {

        PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
        UI.exibirTabuleiro(partidaDeXadrez.getPecas());
    }
}
