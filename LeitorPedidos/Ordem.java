package LeitorPedidos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {
    
    private Date momentoPedido;
    private OrdemStatus statusPedido;

    private List<OrdemItens> listaDePedidos = new ArrayList<>();

    private Cliente novoCliente;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

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

    public List<OrdemItens> getItems() {
		return listaDePedidos;
	}
    
    public void AdicionarItem(OrdemItens item){
        listaDePedidos.add(item);
    }

    public void RemoverItem(OrdemItens item){
        listaDePedidos.remove(item);
    }

    public double TotalPedidos(){
        double soma = 0.0;
        for(OrdemItens it : listaDePedidos){
            soma += it.SubTotal();
        }

        return soma;
    }

    @Override
    public String toString(){
        StringBuilder novaStringBuilder = new StringBuilder();
        novaStringBuilder.append("Data do pedido: ");
        novaStringBuilder.append(sdf.format(momentoPedido) + "\n");
        novaStringBuilder.append("\nStatus do pedido: " + this.statusPedido);
        novaStringBuilder.append("\nCliente: " + novoCliente);
        novaStringBuilder.append("\nItens: ");
        for(OrdemItens itens : listaDePedidos){
            novaStringBuilder.append(itens + "\n");
        }

        novaStringBuilder.append("Total: R$ " + String.format("%.2f", TotalPedidos()));

        return novaStringBuilder.toString();
    }
}
