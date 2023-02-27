package ExerciciosDiversos;

import java.util.Scanner;

public class NumerosEmVetor {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        
        int valor_maximo;

        System.out.print("Quantos números você vai digitar? ");
        valor_maximo = scan.nextInt();

        int[] numeros = new int[valor_maximo];

        for(int i = 0; i < valor_maximo; i++){
            System.out.println("Digite um número: ");
            numeros[i] = scan.nextInt();
        }

        System.out.print("Números negativos: ");
        for(int i = 0; i < valor_maximo; i++){
            if(numeros[i] < 0){
                System.out.printf(" %d", numeros[i]);
            }
        }



    }
}
