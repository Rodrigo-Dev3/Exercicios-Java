package ExerciciosDiversos;

import java.util.Scanner;

public class SomaVetoresDiferentes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resposta;
        
        System.out.print("Quantos valores você quer adicionar em cada vetor? ");
        resposta = scan.nextInt();

        int[] vetor1 = new int[resposta];
        int[] vetor2 = new int[resposta];
        int[] somaVetoresUmeDois = new int[resposta];
        
        System.out.print("Digite os valores do vetor A: ");
        for(int i = 0; i < resposta; i++){
            vetor1[i] = scan.nextInt();    
        }

        System.out.print("Digite os valores do vetor B: ");
        for(int i = 0; i < resposta; i++){
            vetor2[i] = scan.nextInt();    
        }


        for(int i = 0; i <resposta; i++){
            somaVetoresUmeDois[i] = vetor1[i] + vetor2[i];
            System.out.printf("Vetor1: Valor na posição %d + Vetor2: valor na posição %d = %d \n", i, i, somaVetoresUmeDois[i]);
        }

        





    }
}
