package boardgame;

public class Tabuleiro {

    private int linhas;
    private int colunas;
    private Peca[][] pecas;


    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        //Quando instanciar um novo objeto do tipo Tabuleiro, será criado uma matriz com o número de linhas e colunas inseridas nos parâmetros de entrada
        pecas = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public Peca peca(int linha, int coluna){
        return pecas[linha][coluna];
    }

    public Peca peca(Posicao posicao){
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }
}
