package AluguelVeiculos;

import java.time.LocalDateTime;


public class AluguelCarro {
    
    private LocalDateTime comecoAluguel;
    private LocalDateTime fimAluguel;

    private Veiculo veiculo;
    private Fatura fatura; //Como na geração do aluguel não existe fatura - esse campo ficará nulo pois não será inserido nenhuma informação no momento de criação do objeto

    public AluguelCarro() {
    }


    public AluguelCarro(LocalDateTime comecoAluguel, LocalDateTime fimAluguel, Veiculo veiculo) {
        this.comecoAluguel = comecoAluguel;
        this.fimAluguel = fimAluguel;
        this.veiculo = veiculo;
    }


    public LocalDateTime getComecoAluguel() {
        return this.comecoAluguel;
    }

    public void setComecoAluguel(LocalDateTime comecoAluguel) {
        this.comecoAluguel = comecoAluguel;
    }

    public LocalDateTime getFimAluguel() {
        return this.fimAluguel;
    }

    public void setFimAluguel(LocalDateTime fimAluguel) {
        this.fimAluguel = fimAluguel;
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Fatura getFatura() {
        return this.fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }




}
