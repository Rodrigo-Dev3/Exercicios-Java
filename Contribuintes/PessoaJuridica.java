public class PessoaJuridica extends Contribuinte{
    
    private int numeroFuncionarios;


    public PessoaJuridica() {
        super();
    }


    public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }
    

    public int getNumeroFuncionarios() {
        return this.numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }


    @Override
    public Double GastoComImposto() {
        double taxaBasica = 0;

        if(this.getNumeroFuncionarios() > 10){
            taxaBasica = this.getRendaAnual() * 0.14;
        }
        else{
            taxaBasica = this.getRendaAnual() * 0.16;
        }

        return taxaBasica;
        
    }

    
}
