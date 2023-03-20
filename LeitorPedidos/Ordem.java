package LeitorPedidos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {
    
    private Date momentoPedido;
    private OrdemStatus statusPedido;

    private List<OrdemItens> listaDePedidos = new ArrayList<>();

    private Cliente novoCliente;

    public Ordem(Date momentoPedido, OrdemStatus statusPedido, Cliente cliente) {
        this.momentoPedido = momentoPedido;
        this.statusPedido = statusPedido;
        this.novoCliente = cliente;
    }


    public Date getMomentoPedido() {
        return this.momentoPedido;
    }

    public void setMomentoPedido(Date momentoPedido) {
        this.momentoPedido = momentoPedido;
    }

    public OrdemStatus getStatusPedido() {
        return this.statusPedido;
    }

    public void setStatusPedido(OrdemStatus statusPedido) {
        this.statusPedido = statusPedido;
    }
    
    public void AdicionarItem(OrdemItens item){
        listaDePedidos.add(item);
    }

    public void RemoverItem(OrdemItens item){
        listaDePedidos.remove(item);
    }

    // public Double TotalPedidos(){

    // }

    public String toString(){
        StringBuilder novaStringBuilder = new StringBuilder();
        novaStringBuilder.append("\nStatus do pedido: " + this.statusPedido);
        novaStringBuilder.append("\nCliente: " + novoCliente);
        novaStringBuilder.append("\nItens: ");
        for(OrdemItens itens : listaDePedidos){
            novaStringBuilder.append(itens + "\n");
        }

        return novaStringBuilder.toString();
    }
}
