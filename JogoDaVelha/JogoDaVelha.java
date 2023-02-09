package JogoDaVelha;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main (String[] args){

        //Cria o objeto para ser a plataforma do jogo
        Campo[][] jogo = new Campo[3][3];
        
        char simboloAtual = 'X';
        Boolean game = true;
        char vitoria = ' ';
        Scanner scan = new Scanner(System.in);

        iniciarJogo(jogo);

        while(game == true){
            
            desenhaJogo(jogo);
            
            vitoria = verificaVitoria(jogo);
            if(vitoria != (' ')){
                System.out.printf("Jogador %s venceu %n", vitoria);
                game = false;
                break;
            }
            try {
                if(veririficarJogada(jogo, jogar(scan, simboloAtual), simboloAtual)){
                    if(simboloAtual == 'X'){
                        simboloAtual = 'O';
                    }else{
                        simboloAtual = 'X';
                    }
                }

            } catch (Exception e) {
                System.out.println("Erro!");
            }
        }
        System.out.println("Fim do Jogo");

    }

    //Irá receber um objeto do tipo Campo (que foi criado) para que seja desenhado o jogo
    public static void desenhaJogo(Campo[][] velha){
        limparTela();
        System.out.println("   0    1     2");
        System.out.printf("0   %c | %c | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
        System.out.println(" --------------- ");
        System.out.printf("1   %c | %c | %c %n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[2][2].getSimbolo());
        System.out.println(" --------------- ");
        System.out.printf("2   %c | %c | %c %n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
    }

    public static char verificaVitoria(Campo[][] velha){
        for(int i=0;i<3;i++){
			if((velha[i][0].getSimbolo()=='X' && velha[i][1].getSimbolo()=='X' && velha[i][2].getSimbolo()=='X')||(velha[i][0].getSimbolo()=='O' && velha[i][1].getSimbolo()=='O' && velha[i][2].getSimbolo()=='O')){
				return velha[i][0].getSimbolo();
			}
		}
		for(int i=0;i<3;i++){
			if((velha[0][i].getSimbolo()=='X' && velha[1][i].getSimbolo()=='X' && velha[2][i].getSimbolo()=='X')||(velha[0][i].getSimbolo()=='O' && velha[1][i].getSimbolo()=='O' && velha[2][i].getSimbolo()=='O')){
				return velha[0][i].getSimbolo();
			}
		}
		if((velha[0][0].getSimbolo()=='X' && velha[1][1].getSimbolo()=='X' && velha[2][2].getSimbolo()=='X')||(velha[0][2].getSimbolo()=='O' && velha[1][1].getSimbolo()=='O' && velha[2][0].getSimbolo()=='O')){
			return velha[0][0].getSimbolo();
		}
        return ' ';
    }

    public static void limparTela(){
        for(int cont = 0; cont < 10; cont++){
            System.out.println("");
        }
    }

    public static Boolean veririficarJogada(Campo[][] velha, int[] pontoJogado, char simboloAtual){
        if(velha[pontoJogado[0]][pontoJogado[1]].getSimbolo() == ' '){
            velha[pontoJogado[0]][pontoJogado[1]].setSimbolo(simboloAtual);
            return true;
        }else{
            return false;
        }
    }

    public static int[] jogar(Scanner scan, char simboloAtual){
        int[] pontoAtual = new int[2];
        System.out.printf("%s %c %n", "Quem joga: ", simboloAtual);
        System.out.print("Informa a linha");
        pontoAtual[0] = scan.nextInt();
        System.out.print("Informa a coluna");
        pontoAtual[1] = scan.nextInt();

        return pontoAtual;
    }

    public static void iniciarJogo(Campo[][] velha){
        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                velha[linha][coluna] = new Campo();
            }
        }
    }
}