package xadrez;

import boardgame.Peca;
import boardgame.Tabuleiro;

public class PartidaDeXadrez {

    private Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        //Cria as dimensões do tabuleiro de xadrez
        tabuleiro = new Tabuleiro(8, 8);
    }

    public PecaXadrez[][] getPecas(){
        PecaXadrez[][] pecaXadrez = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                pecaXadrez[i][j] = (PecaXadrez) tabuleiro.peca(i, j); //Faz downcasting para interpretar como uma "PecaXadrez" e não como a classe comum criada "Peca"
            }
        }
        return pecaXadrez;
    }
}
