package Banco;

public class Infos {

    private String nomeTitular;
    private int numeroConta;
    private int valorDepositoInicial;
    private int saldoConta;
    private int taxaBanco = 5;

    public Infos(String nomeTitular, int numeroConta, int valorDepositoInicial){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        DepositoConta(valorDepositoInicial);
    }

    public Infos(String nomeTitular, int numeroConta){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        valorDepositoInicial = 0;
        saldoConta = 0;
    }

    public String getNomeTitular(){
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public int getSaldoConta(){
        return this.saldoConta;
    }

    public int DepositoConta(int valorDepositado){
        this.saldoConta += valorDepositado;

        return this.saldoConta;
    }

    public int SaqueConta(int valorSacado){
        this.saldoConta = (this.saldoConta - valorSacado) - taxaBanco;

        return this.saldoConta;
    }
    
    public String toString(){

        return "Conta: " + this.getNumeroConta() + " Cliente: " + this.getNomeTitular() + " O seu saldo é de -> " + this.getSaldoConta(); 
    }

}
