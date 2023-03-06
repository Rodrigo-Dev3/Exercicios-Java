package ExerciciosDiversos;

import java.util.Scanner;

public class LerMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linhas;
        int colunas;

        System.out.print("Informe o número de linhas: ");
        linhas = scan.nextInt();

        System.out.print("Informe o número de colunas: ");
        colunas = scan.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for(int l = 0; l < linhas; l++){
            for(int c = 0; c < colunas; c++){
                System.out.printf("Informe o número para a linha %d | coluna %d: \n", l, c);
                matriz[l][c] = scan.nextInt();
            }
        }

        for(int i = 0; i < linhas; i++){
            System.out.printf("Linha %d |", i);
            for(int j = 0; j < colunas; j++){
                System.out.printf(" Coluna %d -> Valor: %d\n", j, matriz[i][j]);
            }
        }

        System.out.println("Os números na diagonal são: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                //Veriico se o índice da linha é igual o da coluna e imprimo 
                if(i == j){
                    System.out.println(matriz[i][j]);
                }
            }
        }

    scan.close();

    }
}
