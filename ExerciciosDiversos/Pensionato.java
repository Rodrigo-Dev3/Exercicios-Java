package ExerciciosDiversos;

import java.util.Scanner;

public class Pensionato {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeQuartos;

        // Aqui, todas as posições estão "null" pois não há valores inseridos ainda
        AluguelPensionato[] quartosAlugados = new AluguelPensionato[10];

        System.out.print("Quantos quartos serão alugados esta noite? ");
        quantidadeQuartos = scan.nextInt();

        if (quantidadeQuartos < 10) {
            for (int i = 0; i < quantidadeQuartos; i++) {
                System.out.printf("#Aluguel #%d \n", i);
                System.out.print("Informe o seu nome: ");
                // Limpa o buffer da leitura anteior - do nextInt - para ler a próxima - nome
                scan.nextLine();
                String nome = scan.nextLine();
                System.out.print("Informe o seu e-mail: ");
                String email = scan.nextLine();
                System.out.print("Informa o número do quarto desejado: ");
                int numeroQuarto = scan.nextInt();

                // Adiciono o objeto na posição desejada do vetor
                quartosAlugados[numeroQuarto] = new AluguelPensionato(nome, email);
            }

            System.out.print("Informações sobre quartos alugados \n");
            for (int i = 0; i < 10; i++) {
                if (quartosAlugados[i] != null) {
                    System.out.println("Quarto " + i + ": " + quartosAlugados[i]);
                }
            }

            //Encerra e desaloca o scanner quando não for mais preciso
            scan.close();
        }
        else{
            System.out.println("O número de quartos não pode ultrapassar o número de 10 quartos. Tente novamente!");
        }
    }
}