package OrganizarBiblioteca;

public class Principal {
    public static void main(String[] args) {
        Biblioteca bibliotecaPortoAlegre = new Biblioteca();

        Livro livroRomance = new Livro("Até a pé nós iremos", "João Roberto", "Átila", 2020);
        Livro livroRomance2 = new Livro("Até a pé nós iremos 2", "João Roberto", "Átila", 2022);
        Livro livroAventura = new Livro("A sorte está do nosso lado", "João Roberto", "Átila", 2015);
        bibliotecaPortoAlegre.AdicionarLivros(livroRomance);
        bibliotecaPortoAlegre.AdicionarLivros(livroRomance2);
        bibliotecaPortoAlegre.AdicionarLivros(livroAventura);

        bibliotecaPortoAlegre.ListarLivros(bibliotecaPortoAlegre.novosLivros);

        bibliotecaPortoAlegre.RemoverLivros(livroRomance);

        bibliotecaPortoAlegre.ListarLivros(bibliotecaPortoAlegre.novosLivros);
    }
}
