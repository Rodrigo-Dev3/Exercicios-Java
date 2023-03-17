package Trabalhador_Contratos;

import java.util.Date;
import java.time.LocalDate;

import javax.sound.sampled.DataLine;

public class ContrataPorHoras {
    
    private Date data;
    private Double valorPorHora; 
    private Integer horasTrabalhadas;

    public ContrataPorHoras(Date data, Double valorPorHora, Integer horasTrabalhadas){
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Date getData(){
        return this.data;
    }

    public void setData(Date data){
        this.data = data;
    }

    public Double getValorPorHora(){
        return this.valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora){
        this.valorPorHora = valorPorHora;
    }

    public Integer getHorasTrabalhadas(){
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }


    public double ValorTotalTrabalhado(){
        return valorPorHora * horasTrabalhadas;
    }


}
