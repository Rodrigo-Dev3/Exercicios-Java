package AluguelVeiculos;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carroModelo = scan.nextLine();
        System.out.print("Retirada: ");
        LocalDateTime dataInicial = LocalDateTime.parse(scan.nextLine(), formatoData);
        System.out.print("Devolução: ");
        LocalDateTime dataFinal = LocalDateTime.parse(scan.nextLine(), formatoData);

        AluguelCarro carro = new AluguelCarro(dataInicial, dataFinal, new Veiculo(carroModelo));

        System.out.print("Entre com o preço por hora: ");
        double precoPorHora = scan.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double precoPorDia = scan.nextDouble();

        AluguelServico aluguelServico = new AluguelServico(precoPorHora, precoPorDia, new TaxaServicoBrasil()); //No momento de instanciar um serviço utiliza-se a Taxa específica
        aluguelServico.ProcessarFatura(carro);

        System.out.println();
        System.out.println("Fatura");
        System.out.println("Pagamento básico: " + carro.getFatura().getPagamentoMinimo());
        System.out.println("Imposto: " + carro.getFatura().getImposto());
        System.out.println("Pagamento total: " + carro.getFatura().getTotalPamento());
    }
}
