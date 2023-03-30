public class PessoaFisica extends Contribuinte{
    
    private Double gastoComSaude;
    private final Double TAXA_IMPOSTOS_RENDAMENOR = 0.15;
    private final Double TAXA_IMPOSTOS_RENDAMAIOR = 0.25;
    private final Double TAXA_IMPOSTO_GASTOCOMSAUDE = 0.5;


    public PessoaFisica() {
        super();
    }


    public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
        super(nome, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }


    public Double getGastoComSaude() {
        return this.gastoComSaude;
    }

    public void setGastoComSaude(Double gastoComSaude) {
        this.gastoComSaude = gastoComSaude;
    }


    @Override
    public Double GastoComImposto() {
        //double taxaBasica = (this.getRendaAnual() < 20000.0) ? this.getRendaAnual() * 0.15 : this.getRendaAnual() * 0.25;
        
        double taxaBasica = 0;
        
        if(this.getRendaAnual() < 20000.0){
            taxaBasica = this.getRendaAnual() * TAXA_IMPOSTOS_RENDAMENOR;
        }
        else if(this.getRendaAnual() < 20000.0 && this.getGastoComSaude() > 0){
            taxaBasica =  (this.getRendaAnual() * TAXA_IMPOSTOS_RENDAMENOR) - (this.getGastoComSaude() * TAXA_IMPOSTO_GASTOCOMSAUDE);
        }
        else if(this.getRendaAnual() >= 20000.0 && this.getGastoComSaude() > 0){
            taxaBasica =  (this.getRendaAnual() * TAXA_IMPOSTOS_RENDAMAIOR) - (this.getGastoComSaude() * TAXA_IMPOSTO_GASTOCOMSAUDE);
        }
        else if(this.getRendaAnual() >= 20000.0){
            taxaBasica = this.getRendaAnual() * TAXA_IMPOSTOS_RENDAMAIOR;
        }

        return taxaBasica;
    }

    

}
