package ListadeFuncionarios;

public class Terceirizado extends Colaborador{
    
    private Double cobrancaAdicional;


    public Terceirizado() {
        super();
    }

    public Terceirizado(String nome, Integer horasTrabalhadas, Double valorPorHoraTrabalhada, Double cobrancaAdicional) {
        super(nome, horasTrabalhadas, valorPorHoraTrabalhada);
        this.cobrancaAdicional = cobrancaAdicional;
    }


    public Double getCobrancaAdicional() {
        return this.cobrancaAdicional;
    }

    public void setCobrancaAdicional(Double cobrancaAdicional) {
        this.cobrancaAdicional = cobrancaAdicional;
    }

    
    @Override
    public final Double PagamentoColaboradores(){
       
       return super.PagamentoColaboradores() + cobrancaAdicional * 1.1; //1.1 se refere ao acréscimo de 110%;
       
    }

}
