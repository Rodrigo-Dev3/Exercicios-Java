package EnderecoPessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadePessoas = 0;
        int sair = 0;

        do{
            scan.nextLine();
            System.out.print("Digite o nome: ");
            String nome = scan.nextLine();
            System.out.print("Digite o endereço: ");
            String endereco = scan.nextLine();
            System.out.print("Digite a idade: ");
            int idade = scan.nextInt();
            Pessoa novaPessoa = new Pessoa(nome, endereco, idade);
    
            System.out.println("Agora vamos adicionar o endereço");
            System.out.println("Digite a rua: ");
            String rua = scan.nextLine();
            System.out.println("Digite o bairro: ");
            String bairro = scan.nextLine();
            System.out.println("Digite o número: ");
            int numero = scan.nextInt();
            Endereco novoEndereco = new Endereco(rua, bairro, numero);
            novaPessoa.AdicionarEndereco(novoEndereco);
            quantidadePessoas++;

            for(int i = 0; i < quantidadePessoas; i++){
                System.out.print(novaPessoa);
                System.out.println(novoEndereco);
            }

            System.out.print("Gostaria de adicionar mais uma pessoa? 1 - Não ou 0 - Sim");
            sair = scan.nextInt();

        }while(sair != 1);
        


        

    }

}
