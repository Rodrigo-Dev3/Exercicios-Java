package PostRedeSocial;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    //Para não ter que instanciar toda vez que chamar um novo post, instancia-se o formato da data utilizando uma variável static
    private static SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

    private Date momentoDaPostagem;
    private String tituloDaPostagem;
    private String conteudoDaPostagem;
    private Integer curtidasDaPostagem;

    private List<Comentario> comentarios = new ArrayList<>();
    
    public Post(){

    }

    public Post(Date momentoPostagem, String titutloPostagem, String conteudoPostagem, Integer curtidasPostagem){
        this.momentoDaPostagem = momentoPostagem;
        this.tituloDaPostagem = titutloPostagem;
        this.conteudoDaPostagem = conteudoPostagem;
        this.curtidasDaPostagem = curtidasPostagem;

    }

    public String getMomentoDaPostagem() {
        return this.momentoDaPostagem;
    }

    public void setMomentoDaPostagem(Date momentoDaPostagem) {
        this.momentoDaPostagem = momentoDaPostagem;
    }

    public String getTituloDaPostagem() {
        return this.tituloDaPostagem;
    }

    public void setTituloDaPostagem(String tituloDaPostagem) {
        this.tituloDaPostagem = tituloDaPostagem;
    }

    public String getConteudoDaPostagem() {
        return this.conteudoDaPostagem;
    }

    public void setConteudoDaPostagem(String conteudoDaPostagem) {
        this.conteudoDaPostagem = conteudoDaPostagem;
    }

    public Integer getCurtidasDaPostagem() {
        return this.curtidasDaPostagem;
    }

    public void setCurtidasDaPostagem(Integer curtidasDaPostagem) {
        this.curtidasDaPostagem = curtidasDaPostagem;
    }


    public List<Comentario> getComentarios() {
        return this.comentarios;
    }

    public void AdicionarComentarios(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void RemoverComentarios(Comentario comentario){
        comentarios.remove(comentario);
    }
    
    public String toString(){
        //A função StringBuilder é utilizada quando queremos CONCATENAR MUITAS strings - sem que seja utilizada o "+", que pode deixar o programa lento
        StringBuilder novoStringBuilder = new StringBuilder();
        //O método append adiciona no final de uma string, ou seja, vai juntando as strings 
        novoStringBuilder.append(tituloDaPostagem + "\n");
        novoStringBuilder.append(curtidasDaPostagem + "\n");
        novoStringBuilder.append(dataFormatada.format(momentoDaPostagem) + "\n");
        novoStringBuilder.append(conteudoDaPostagem + "\n");
        novoStringBuilder.append("-------------------------------------------------------\n");
        novoStringBuilder.append("Comentários" + "\n");
        novoStringBuilder.append("\n");

        //Como será preciso varrer uma list, será preciso criar um for para ler cada elemento dentro dessa list
        for(Comentario comentarioIndividual : comentarios){
            novoStringBuilder.append(comentarioIndividual.getTextoComentario() + "\n");
        }
        novoStringBuilder.append("-------------------------------------------------------");

        //Aqui eu retorno esse StringBuilder e transformo ele em uma String com o método toString()
        return novoStringBuilder.toString();
    }

}
