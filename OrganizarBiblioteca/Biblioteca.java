package OrganizarBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    
    List<Livro> novosLivros = new ArrayList<>();

    public void AdicionarLivros(Livro novoLivro){
        novosLivros.add(novoLivro);
    }

    public void RemoverLivros(Livro livroAdicionado){
        novosLivros.remove(livroAdicionado);
    }

    public void ListarLivros(List<Livro> listaLivros){
        for(Livro livro : novosLivros){
            System.out.println(livro + "\n");
        }
    }
}
