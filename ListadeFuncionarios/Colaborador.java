package ListadeFuncionarios;

public class Colaborador {
    
    private String nome;
    private Integer horasTrabalhadas;
    private Double valorPorHoraTrabalhada;


    public Colaborador() {
    }


    public Colaborador(String nome, Integer horasTrabalhadas, Double valorPorHoraTrabalhada) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHoraTrabalhada = valorPorHoraTrabalhada;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorPorHoraTrabalhada() {
        return this.valorPorHoraTrabalhada;
    }

    public void setValorPorHoraTrabalhada(Double valorPorHoraTrabalhada) {
        this.valorPorHoraTrabalhada = valorPorHoraTrabalhada;
    }


    public Double PagamentoColaboradores(){
        return  horasTrabalhadas * valorPorHoraTrabalhada;
    }

    @Override
    public String toString(){
        StringBuilder novoStringBuilder = new StringBuilder();
        novoStringBuilder.append("------------------------------------------");
        novoStringBuilder.append("\nNome: " + getNome());
        novoStringBuilder.append("\nHoras trabalhadas: " + getHorasTrabalhadas());
        novoStringBuilder.append("\nValor por hora trabalhada: " + getValorPorHoraTrabalhada());
        novoStringBuilder.append("\nPagamento: " + PagamentoColaboradores());
        novoStringBuilder.append("\n------------------------------------------\n");

        return novoStringBuilder.toString();
    }
}
