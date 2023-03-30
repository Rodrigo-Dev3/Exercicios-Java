package ListadeFuncionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



public class PrincipalListaDeFuncionarios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int respostaScan = 0;

        List<Colaborador> listaDeColaboradores = new ArrayList<>();

        System.out.print("Informe quantos colaboradores você deseja adicionar: ");
        respostaScan = scan.nextInt();

        for(int i = 0; i < respostaScan; i++){
            scan.nextLine();
            System.out.print("\nÉ terceirizado? [S/N] ");
            char terceiro = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("\nDigite o nome: ");
            String nome = scan.nextLine();
            System.out.print("\nDigite as horas trabalhadas: ");
            Integer horasTrabalhadas = scan.nextInt();
            System.out.print("\nDigite o valor da hora de trabalho: ");
            double valorHoraTrabalhada = scan.nextDouble();
            if(terceiro == 'S'){
                System.out.print("Digite o valor do adicional: ");
                double valorAdicional = scan.nextDouble();
                Colaborador novoColaborador = new Terceirizado(nome, horasTrabalhadas, valorHoraTrabalhada, valorAdicional);
                listaDeColaboradores.add(novoColaborador);
            }
            else{
                Colaborador novoColaborador = new Colaborador(nome, horasTrabalhadas, valorHoraTrabalhada);
                listaDeColaboradores.add(novoColaborador);
            }
            
        }

        for(Colaborador c : listaDeColaboradores){
            System.out.println(c);
        }
    }
}
