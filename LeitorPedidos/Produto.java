package LeitorPedidos;

public class Produto {
    private String nomeProduto;
    private Double precoProduto;

    public Produto(String nomeProduto, Double precoProduto){
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }


    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPrecoProduto() {
        return this.precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String toString(){
        StringBuilder novaStringBuilder = new StringBuilder();
        novaStringBuilder.append("\nNome do Produto: " + this.getNomeProduto());
        novaStringBuilder.append("\nPreço do produto: " + this.getPrecoProduto());

        return novaStringBuilder.toString();
    }
}
