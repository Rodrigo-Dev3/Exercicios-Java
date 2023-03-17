package Trabalhador_Contratos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Colaborador {
    
    private String nome;
    private NivelTrabalho nivelTrabalhador;
    private Double salarioBase;

    //Associações seguindo o diagrama UML da imagem do exercício
    private Departamento departamento; //Um colaborador contém 1 departamento
    //Um colaborador contêm vários contratos - por isso há um list aqui - listas devem ser instanciada
    private List<ContrataPorHoras> contratos = new ArrayList<>(); 

    public Colaborador(){

    }

    public Colaborador(String nome, NivelTrabalho nivelTrabalhador, Double salarioBase, Departamento departamento){
        this.nome = nome;
        this.nivelTrabalhador = nivelTrabalhador;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public NivelTrabalho getNivelTrabalhador(){
        return this.nivelTrabalhador;
    }

    public void setNivelTrabalhador(NivelTrabalho nivelTrabalhador){
        this.nivelTrabalhador = nivelTrabalhador;
    }

    public Double getSalarioBase(){
        return this.salarioBase;
    }

    public void setSalarioBase(Double salarioBase){
        this.salarioBase = salarioBase;
    }

    public List<ContrataPorHoras> getContrato(){
        return contratos;
    }

    //Essa não pode existir - pois já existirá os métodos para adicionar e remover os contratos
    // public void setContratos(List<ContrataPorHoras> contratos){
    //     this.contratos = contratos;
    // }

    public Departamento getDepartamento(){
        return this.departamento;
    }

    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }


    //Adicionará ou removerá contratos na lista que está contida dentro desta classe - lista que foi instanciada anteriormente
    public void AdicionarContrato(ContrataPorHoras novoContrato){
        contratos.add(novoContrato);
    }

    public void RemoverContrato(ContrataPorHoras removeContrato){
        contratos.remove(removeContrato);
    }

    public Double GanhosAno(int ano, int mes){
        Double soma = salarioBase;
        Calendar calendario = Calendar.getInstance(); //Utiliza a classe Calendar para saber a data

        for(ContrataPorHoras contrato : contratos){
            calendario.setTime(contrato.getData()); //Pega e seta a data do calendário como sendo a data adicionada no Date do Contrato adicionado
            int contratoAno = calendario.get(calendario.YEAR); //Pega o ano dessa data adicionada
            int contratoMes = 1 + calendario.get(calendario.MONTH); //Pega o mês dessa data adicionada

            if(ano == contratoAno && mes == contratoMes){ //Faz a comparação se o ano e o mês são os mesmo informados
                soma += contrato.ValorTotalTrabalhado(); //Realiza a soma
            }
        }

        return soma;
    }

    

}
