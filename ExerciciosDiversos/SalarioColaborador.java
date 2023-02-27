package ExerciciosDiversos;

import java.util.Scanner;

public class SalarioColaborador{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Colaborador colaborador = new Colaborador();

        System.out.print("Nome: ");
        colaborador.nome = scan.nextLine();

        System.out.print("Salário: ");
        colaborador.salarioBruto = scan.nextDouble();

        System.out.print("Taxa: ");
        colaborador.taxaSalarioBruto = scan.nextDouble();

        System.out.printf("O seu salário será de: R$ %.2f ", colaborador.salario());
        
        System.out.print("Qual o percentual você gostaria de adicionar? ");
        Double percentual = scan.nextDouble();

        colaborador.acrescentarSalario(percentual);
        System.out.println();
        System.out.println("Novo salário: " + colaborador);


    }
}