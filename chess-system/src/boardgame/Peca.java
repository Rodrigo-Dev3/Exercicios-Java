package boardgame;

public class Peca {

    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro) {
        posicao = null;
        this.tabuleiro = tabuleiro;
    }

    //Somente classes dentro do mesmo pacote e subclasse irão poder acessar o tabuleiro de uma peça - por isso está como protected
    //Ele não será acessível pela segunda camada do programa - a camada de xadrez
    //O tabuleiro será acessível apenas para as peças - que serão as suas subclasses
    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

}
