package OrganizarBiblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;

    public Livro(String titulo, String autor, String editora, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String toString(){
        StringBuilder novoStringBuilder = new StringBuilder();
        novoStringBuilder.append("Titulo: " + this.getTitulo());
        novoStringBuilder.append("\nAutor: " + this.getAutor());
        novoStringBuilder.append("\nEditora: " + this.getEditora());
        novoStringBuilder.append("\nAno da Pulicação: " + this.getAnoPublicacao());

        return novoStringBuilder.toString();
    }
}
