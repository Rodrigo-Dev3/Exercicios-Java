package LeitorPedidos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

        List<Ordem> novaOrdemDePedidos = new ArrayList<>();
        
        System.out.println("Informe os dados do cliente");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("E-mail: ");
        String email = scan.nextLine();
        System.out.print("\nData de nascimento: ");
        Date dataNascimento = dataFormatada.parse(scan.nextLine());
        Cliente novoCliente = new Cliente(nome, email, dataNascimento);

        System.out.print("Adicione o status do pedido");
        System.out.print("\nStatus: ");
        OrdemStatus statusPedido = OrdemStatus.valueOf(scan.next());

        Ordem novaOrdem = new Ordem(new Date(), statusPedido, novoCliente);


        System.out.println("Informe a quantidade de intens que você gostaria de adicionar: ");
        int quantidade = scan.nextInt();

        for(int i = 0; i < quantidade; i++){
            System.out.print("Nome do produto: ");
            scan.nextLine();
            String nomeProduto = scan.nextLine();
            System.out.print("Preço do produto: ");
            Double precoProduto = scan.nextDouble();

            Produto novoProduto = new Produto(nomeProduto, precoProduto);

            System.out.print("Quantidade: ");
            int quantidadeProdutos = scan.nextInt();

            OrdemItens novaOrdemItens = new OrdemItens(quantidadeProdutos, precoProduto, novoProduto);
            novaOrdem.AdicionarItem(novaOrdemItens);
        }

       System.out.println();
       System.out.println("Resumo do pedido");
       System.out.println(novaOrdemDePedidos);

 

    }
}
