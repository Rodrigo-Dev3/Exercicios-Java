package AluguelVeiculos;

public class Fatura {
    
    private Double pagamentoMinimo;
    private Double imposto;


    public Fatura() {
    }


    public Fatura(Double pagamentoMinimo, Double imposto) {
        this.pagamentoMinimo = pagamentoMinimo;
        this.imposto = imposto;
    }


    public Double getPagamentoMinimo() {
        return this.pagamentoMinimo;
    }

    public void setPagamentoMinimo(Double pagamentoMinimo) {
        this.pagamentoMinimo = pagamentoMinimo;
    }

    public Double getImposto() {
        return this.imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public Double getTotalPamento(){
        
        return getPagamentoMinimo() + getImposto();
    }
}
