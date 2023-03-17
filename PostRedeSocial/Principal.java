package PostRedeSocial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comentario novoComentario = new Comentario("Fico feliz por você!");
        Comentario novoComentario2 = new Comentario("Parabéns!");

        Post novoPost = new Post(formatoData.parse("10/12/2023 10:30:56"), "Estou de Férias!", "Agora posso viajar o quanto eu quiser", 2000);
        
        novoPost.AdicionarComentarios(novoComentario);
        novoPost.AdicionarComentarios(novoComentario2);

       System.out.print(novoPost);


    }
}
