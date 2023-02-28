package ExerciciosDiversos;

import java.util.Scanner;

public class AlturaeGeneroVetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int respostaQuantidadePessoas;

        double maiorAltura;
        double menorAltura;
        int quantidadeHomens = 0;
        int quantidadeMulheres = 0;
        double mediaAlturaMulheres, mediaAlturaHomens, somaAlturaMulheres, somaAlturaHomens;
        mediaAlturaMulheres = mediaAlturaHomens = somaAlturaMulheres = somaAlturaHomens = 0;
        
        System.out.print("Quantas pessoas serão inseridas no vetor? ");
        respostaQuantidadePessoas = scan.nextInt();

        double[] respostaAltura = new double[respostaQuantidadePessoas]; 
        char[] respostaGenero = new char[respostaQuantidadePessoas];
        
        for(int i = 0; i < respostaQuantidadePessoas; i++){
            System.out.printf("Digite a altura da pessoa %d: ", i);
            respostaAltura[i] = scan.nextDouble(); 
            System.out.printf("Digite o gênero [M/F] da pessoa %s: ", i);
            respostaGenero[i] = scan.next().charAt(0);
        }

        //Defino um valor como maior e menor para servir de comparação
        menorAltura = respostaAltura[0];
	    maiorAltura = respostaAltura[0];

        
        for(int i = 0; i < respostaQuantidadePessoas; i++){
            if(respostaAltura[i] > maiorAltura){
                maiorAltura = respostaAltura[i];
            }
            if(respostaAltura[i] < menorAltura){
                menorAltura = respostaAltura[i];
            }
        }

        for(int i = 0; i < respostaQuantidadePessoas; i++){
            if(respostaGenero[i] == 'm'){
                quantidadeHomens++;
                somaAlturaHomens += respostaAltura[i];
            }
            else{
                quantidadeMulheres++;
                somaAlturaMulheres += respostaAltura[i];
            }
        }

        for(int i = 0; i < respostaQuantidadePessoas; i++){
            mediaAlturaMulheres = somaAlturaMulheres / quantidadeMulheres;
        }

        for(int i = 0; i < respostaQuantidadePessoas; i++){
            mediaAlturaHomens = somaAlturaHomens / quantidadeHomens;
        }

        System.out.printf("A quantidade de homens é: %d\n", quantidadeHomens);
        System.out.printf("A media da altura dos homens é: %.2f\n", mediaAlturaHomens);
        System.out.printf("A quantidade de mulheres é: %d\n", quantidadeMulheres);
        System.out.printf("A media da altura das mulheres é: %.2f\n", mediaAlturaMulheres);
        System.out.printf("A maior altura é: %.2f\n", maiorAltura);
    }
}
