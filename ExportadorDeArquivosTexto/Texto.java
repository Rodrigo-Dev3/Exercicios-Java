package ExportadorDeArquivosTexto;

public class Texto {
    
    private String nomeEscritor;
    private String conteudoTexto;
    private String tituloTexto;
    private String generoTexto;


    public Texto(String nomeEscritor, String conteudoTexto, String tituloTexto, String generoTexto) {
        this.nomeEscritor = nomeEscritor;
        this.conteudoTexto = conteudoTexto;
        this.tituloTexto = tituloTexto;
        this.generoTexto = generoTexto;
    }


    public String getNomeEscritor() {
        return this.nomeEscritor;
    }

    public void setNomeEscritor(String nomeEscritor) {
        this.nomeEscritor = nomeEscritor;
    }

    public String getConteudoTexto() {
        return this.conteudoTexto;
    }

    public void setConteudoTexto(String conteudoTexto) {
        this.conteudoTexto = conteudoTexto;
    }

    public String getTituloTexto() {
        return this.tituloTexto;
    }

    public void setTituloTexto(String tituloTexto) {
        this.tituloTexto = tituloTexto;
    }

    public String getGeneroTexto() {
        return this.generoTexto;
    }

    public void setGeneroTexto(String generoTexto) {
        this.generoTexto = generoTexto;
    }


    @Override
    public String toString(){
        return "Nome do escritor: " + nomeEscritor + "\n" + tituloTexto + "\n\n" + conteudoTexto + "\n\n" + "Gênero: " + generoTexto;
    }
}
