package LerArquivosItens;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       List<Item> intensSelecionados = new ArrayList<>();
        
        System.out.println("*** ITENS ***");
        System.out.print("Nome: ");
        String nomeItem = scan.nextLine();
        System.out.print("Preço: ");
        double precoItem = scan.nextDouble();
        System.out.print("Quantidade: ");
        int quantidadeItem = scan.nextInt();

        Item novoItem = new Item(nomeItem, precoItem, quantidadeItem);
        intensSelecionados.add(novoItem);

        String pathItens = "C:\\Users\\Fronz\\OneDrive\\Área de Trabalho\\itensSelecionados.txt";
        try (BufferedWriter novoBuffer = new BufferedWriter(new FileWriter(pathItens, true))) {
            for(Item item : intensSelecionados){
                novoBuffer.write(item.toString());
                novoBuffer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        scan.close();
    }
}