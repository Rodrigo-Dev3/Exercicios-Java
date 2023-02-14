package JogoDaVelha;

import java.util.Scanner;

public class JogoDaVelhaComentado {
    public static void main(String[] args){
        
        Campo[][] cenarioJogos = new Campo[3][3];

        char simboloAtual = 'X';
        Boolean gameIniciado = true;
        char campo = ' ';
        Scanner scan = new Scanner(System.in);

        //Montar o cenário e os campos
        iniciarJogo(cenarioJogos);

        while(gameIniciado == true){

            //Antes de iniciar o jogo realmente, é montado o cenário
            desenhaJogo(cenarioJogos);

            campo = verificaVitoria(cenarioJogos);
            if(campo != ' '){
                System.out.printf("O jogador %s venceu! %n", campo);
                gameIniciado = false;
                break;
            }

            try {
                if(verificarJogada(cenarioJogos, jogar(scan, simboloAtual), simboloAtual)){
                    if(simboloAtual == 'X'){
                        simboloAtual = 'O';
                    }else{
                        simboloAtual = 'X';
                    }

                }
                
            } catch (Exception e) {
                System.out.print("Erro!");
            }

            System.out.println("Fim do Jogo");
        }
    }

    public static void desenhaJogo(Campo[][] velha){
        limparTela();
        System.out.println("   0    1     2");
        System.out.printf("0   %c | %c | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
        System.out.println(" --------------- ");
        System.out.printf("1   %c | %c | %c %n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[2][2].getSimbolo());
        System.out.println(" --------------- ");
        System.out.printf("2   %c | %c | %c %n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
    }

    public static void limparTela(){
        for(int cont = 0; cont < 10; cont++){
            System.out.println("");
        }
    }

    public static void iniciarJogo(Campo[][] jogoVelha){
        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                //A cada iteração será criado um espaço do tipo campo - para ser preenchido
                jogoVelha[linha][coluna] = new Campo(); 
            }
        }
    }

    public static char verificaVitoria(Campo[][] velha){
        //Faz a verificação em cada linha horizontal
        for(int i = 0; i < 3; i++){
            if((velha[i][0].getSimbolo() == 'X' && velha[i][1].getSimbolo() == 'X' && velha[i][2].getSimbolo() == 'X') || (velha[i][0].getSimbolo() == 'O' && velha[i][1].getSimbolo() == 'O' & velha[i][2].getSimbolo() == 'O')){
                return velha[i][0].getSimbolo();
            }
        }
        //Faz a verificação em cada linha vertical
        for(int i=0;i<3;i++){
			if((velha[0][i].getSimbolo()=='X' && velha[1][i].getSimbolo()=='X' && velha[2][i].getSimbolo()=='X')||(velha[0][i].getSimbolo()=='O' && velha[1][i].getSimbolo()=='O' && velha[2][i].getSimbolo()=='O')){
				return velha[0][i].getSimbolo();
			}
		}
        //Faz a verificação em cada linha diagonal
		if((velha[0][0].getSimbolo()=='X' && velha[1][1].getSimbolo()=='X' && velha[2][2].getSimbolo()=='X')||(velha[0][2].getSimbolo()=='O' && velha[1][1].getSimbolo()=='O' && velha[2][0].getSimbolo()=='O')){
			return velha[0][0].getSimbolo();
		}

        return ' ';
    }

    public static Boolean verificarJogada(Campo[][] velha, int[] pontoJogado, char simboloAtual){
        if(velha[pontoJogado[0]][pontoJogado[1]].getSimbolo() == ' '){
            velha[pontoJogado[0]][pontoJogado[1]].setSimbolo(simboloAtual);
            return true;
        }else{
            return false;
        }
    }

    public static int[] jogar(Scanner scan, char simboloAtual){
        int[] pontoAtual = new int[2];
        System.out.printf("%s %c %n", "Quem joga ->  ", simboloAtual);
        System.out.print("Informa a linha: ");
        pontoAtual[0] = scan.nextInt();
        System.out.print("Informa a coluna: ");
        pontoAtual[1] = scan.nextInt();

        return pontoAtual;
    }
}