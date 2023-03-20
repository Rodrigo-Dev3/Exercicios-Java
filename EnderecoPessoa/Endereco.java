package EnderecoPessoa;

import java.util.ArrayList;
import java.util.List;

public class Endereco {
    
    private String rua;
    private String bairro;
    // private String cidade;
    // private String estado;
    private int numero;

    public Endereco(){

    }

    public Endereco(String rua, String bairro, int numero){
        this.rua = rua;
        this.bairro = bairro;
        // this.cidade = cidade;
        // this.estado = estado;
        this.numero = numero;
    }


    
    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    // public String getCidade() {
    //     return this.cidade;
    // }

    // public void setCidade(String cidade) {
    //     this.cidade = cidade;
    // }

    // public String getEstado() {
    //     return this.estado;
    // }

    // public void setEstado(String estado) {
    //     this.estado = estado;
    // }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString(){
        StringBuilder novoStringBuilder = new StringBuilder();
        novoStringBuilder.append("\nRua: " + this.getRua());
        novoStringBuilder.append("\nBairro: " + this.getBairro());
        novoStringBuilder.append("\nNumero: " + this.getNumero());
        novoStringBuilder.append("\n");
        novoStringBuilder.append("-------------------------------------------------------\n");


        return novoStringBuilder.toString();
    }
}
