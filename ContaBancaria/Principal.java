package ContaBancaria;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        

        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite o número da sua conta: ");
            int conta = scan.nextInt();
            scan.nextLine();
            System.out.print("Digite o seu nome: ");
            String nome = scan.nextLine();

            Conta novaConta = new Conta(conta, nome, 0.0);
            novaConta.Saque(1.0);

            System.out.print("Saldo atual: " + novaConta.getSaldo());
        } 
        catch (SaqueException e) {
            System.out.print("Erro: " + e.getMessage());
        }

    }
}
