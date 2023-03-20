package EnderecoPessoa;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    
    private String nome;
    private String endereco;
    private int idade;

    public Pessoa(){

    }

    public Pessoa(String nome, String endereco, int idade){
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }
    
    public List<Endereco> novoEnderecos = new ArrayList<>();


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString(){
        StringBuilder novoStringBuilder = new StringBuilder();
        novoStringBuilder.append("\nNome: " + this.getNome());
        novoStringBuilder.append("\nEndereço: " + this.getEndereco());
        novoStringBuilder.append("\nIdade: " + this.getIdade());
        novoStringBuilder.append("\n");
        novoStringBuilder.append("-------------------------------------------------------\n");


        return novoStringBuilder.toString();
    }

    public void AdicionarEndereco(Endereco novoEndereco){
        novoEnderecos.add(novoEndereco);
    }


}
