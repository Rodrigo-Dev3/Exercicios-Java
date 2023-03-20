package LeitorPedidos;

public class OrdemItens {
    private Integer quantidadeProdutos;
    private Double preco;

    private Produto novoProduto;

    public OrdemItens(Integer quantidadeProdutos, Double preco, Produto produto){
        this.quantidadeProdutos = quantidadeProdutos;
        this.preco = preco;
        this.novoProduto = produto;

    }

    public Integer getQuantidadeProdutos() {
        return this.quantidadeProdutos;
    }

    public void setQuantidadeProdutos(Integer quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    // public Double SubTotal(){

    // }

    public String toString(){
        StringBuilder novaStringBuilder = new StringBuilder();
        novaStringBuilder.append("\nQuantidade do Produto: " + this.getQuantidadeProdutos());
        novaStringBuilder.append("\nPreço do produto: " + this.getPreco());

        return novaStringBuilder.toString();
    }
}
