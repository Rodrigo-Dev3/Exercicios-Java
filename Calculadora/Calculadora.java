package Calculadora;

import java.util.Scanner;

public class Calculadora{

    public static void main(String[] args){

        Operacoes operacoes = new Operacoes();

        Scanner novoScanner = new Scanner(System.in);

        Numero numero1 = new Numero();
        Numero numero2 = new Numero();
        float resultado;
        int opcao;
        int continuar = 1;

        do{

            System.out.println("------------------------------------------------------");
            System.out.print("Digite o primeiro valor: ");
            numero1.setValor(novoScanner.nextInt());

            System.out.print("Digite o segundo valor: ");
            numero2.setValor(novoScanner.nextInt());

            System.out.println("------------------------------------------------------");
            System.out.println("[1] Somar\n[2] Subtrair\n[3] Multiplicar\n[4] Dividir");
            System.out.print("Qual operação você deseja realizar? ");
            opcao = novoScanner.nextInt();
            System.out.println("------------------------------------------------------");


            switch(opcao){
                case 1:
                    resultado = operacoes.Somar(numero1.getValor(), numero2.getValor());
                    System.out.printf("%s + %s = %s \n", numero1.getValor(), numero2.getValor(), resultado);
                    break;
                case 2:
                    resultado = operacoes.Subtrair(numero1.getValor(), numero2.getValor());
                    System.out.printf("%s - %s = %s \n", numero1.getValor(), numero2.getValor(), resultado);
                    break;
                case 3:
                    resultado = operacoes.Multiplicar(numero1.getValor(), numero2.getValor());
                    System.out.printf("%s * %s = %s \n", numero1.getValor(), numero2.getValor(), resultado);
                    break;
                case 4:
                    resultado = operacoes.Dividir(numero1.getValor(), numero2.getValor());
                    System.out.printf("%s / %s = %s \n", numero1.getValor(), numero2.getValor(), resultado);
                    break;
            }

            System.out.println("------------------------------------------------------");
            System.out.print("Aperte [0] para finalizar ou [1] se deseja continuar: ");
            continuar = novoScanner.nextInt();

        }while(continuar != 0);

        System.out.println("------------------------------------------------------");
        System.out.println("Calculadora finalizada com sucesso. Até mais!");
        
    }



}