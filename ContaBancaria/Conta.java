package ContaBancaria;

public class Conta {
    
    private Integer numeroConta;
    private String suporte;
    private Double saldo;
    private Double saqueLimite;

    private final Double LIMITE_SAQUE_NOVAS_CONTAS = 500.0;


    public Conta() {
    }


    public Conta(Integer numeroConta, String suporte, Double saldo) {
        this.numeroConta = numeroConta;
        this.suporte = suporte;
        this.saldo = saldo;
        this.saqueLimite = LIMITE_SAQUE_NOVAS_CONTAS;
    }


    public Integer getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getSuporte() {
        return this.suporte;
    }

    public void setSuporte(String suporte) {
        this.suporte = suporte;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public Double getSaqueLimite() {
        return this.saqueLimite;
    }

 
    public void Deposito(double montante){
        this.saldo += montante;
    }

    public void Saque(double montante) throws SaqueException{
        if(this.getSaldo() <= 0){
            throw new SaqueException("Saldo insuficiente para concretizar a transação");
        }
        else if(montante > this.saqueLimite){
            throw new SaqueException("Você ultrapassou o limite de saque da sua conta");
        }
        else{
            this.saldo -= montante;
        }
    }
}
