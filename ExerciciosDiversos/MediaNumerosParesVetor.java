package ExerciciosDiversos;

import java.util.Scanner;

public class MediaNumerosParesVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resposta;

        float media = 0;
        float soma = 0;
        int numerosPares = 0;

        System.out.print("Quantos elementos você deseja inserir no vetor? ");
        resposta = scan.nextInt();

        int[] vetor1 = new int[resposta];
        for(int i = 0; i < resposta; i++){
            System.out.print("Digite um número: ");
            vetor1[i] = scan.nextInt();
        }

        for(int i = 0; i < resposta; i++){
            if(vetor1[i] % 2 != 0){
                continue;
            }
            else{
                soma += vetor1[i];
                media = soma / resposta;
                numerosPares++;
            }
        }

        if(numerosPares == 0){
            System.out.print("Nenhum número par foi inserido no vetor");
        }
        else{
            System.out.printf("A soma é igual a %.2f", soma);
            System.out.printf("\nA media é igual a %.2f", media);
        }

    }
}
