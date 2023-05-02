package AluguelVeiculos;

import java.time.Duration;

public class AluguelServico {
    
    private Double precoPorHora;
    private Double precoPorDia;

    private TaxaServicoInterface taxaServico; //Depende de uma interface genérica que é a interface TaxaServiço - conforme for a taxa de outros países, a classe principal não é afetada pela mudança pois utiliza uma Interface genérica


    public AluguelServico(Double precoPorHora, Double precoPorDia, TaxaServicoInterface taxaServico) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxaServico = taxaServico;
    }

    public void ProcessarFatura(AluguelCarro aluguelCarro){
        
        //Faz o cálculo entre duas unidades de medida - o Duration.between
        double minutos = Duration.between(aluguelCarro.getComecoAluguel(), aluguelCarro.getFimAluguel()).toMinutes(); //converte o valor para minutos - com o toMinutes
        double horas = minutos / 60.0;

        double pagamentoMinimo;

        if(horas <= 12){
            pagamentoMinimo = precoPorHora * Math.ceil(horas); //Faz o arredondamento do valor para cima - com o Math.ceil
        }
        else{
            pagamentoMinimo = precoPorDia * Math.ceil(horas / 24.0);
        }

        double taxa = taxaServico.taxa(pagamentoMinimo);

        aluguelCarro.setFatura(new Fatura(pagamentoMinimo, taxa));

    }
}
