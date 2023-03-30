public abstract class Contribuinte {
    
    private String nome;
    private Double rendaAnual;


    public Contribuinte() {
    }

    public Contribuinte(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return this.rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }


    public abstract Double GastoComImposto();

    //public abstract void TotalImpostoArrecadado();
}
