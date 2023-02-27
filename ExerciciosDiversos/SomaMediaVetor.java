package ExerciciosDiversos;

import java.util.Scanner;

public class SomaMediaVetor {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] numeros_reais;
        int numerosMaximo;

        System.out.print("Quantos números você deseja digitar? ");
        numerosMaximo = scan.nextInt();

        numeros_reais = new int[numerosMaximo];

        for(int i = 0; i < numerosMaximo; i++){
            System.out.print("Digite um número: ");
            numeros_reais[i] = scan.nextInt();
        }

        System.out.print("Valores: ");
        for(int i = 0; i < numerosMaximo; i++){
            System.out.printf("%d ", numeros_reais[i]);
        }

        float soma = 0;
        System.out.print(" Soma: ");
        for(int i = 0; i < numerosMaximo; i++){
            soma = soma + numeros_reais[i];
        }

        System.out.printf(" %.2f", soma);

        float media = 0;
        System.out.print(" Media: ");
        for(int i = 0; i < numerosMaximo; i++){
            media = soma / numerosMaximo;
        }

        System.out.printf("%.2f", media);


    }
}
