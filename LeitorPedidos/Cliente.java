package LeitorPedidos;

import java.util.Date;

public class Cliente {
    private String nome;
    private String email;
    private Date dataNascimentoCliente;
    
    public Cliente(String nome, String email, Date dataNascimentoCliente){
        this.nome = nome;
        this.email = email;
        this.dataNascimentoCliente = dataNascimentoCliente;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimentoCliente() {
        return this.dataNascimentoCliente;
    }

    public void setDataNascimentoCliente(Date dataNascimentoCliente) {
        this.dataNascimentoCliente = dataNascimentoCliente;
    }

}
