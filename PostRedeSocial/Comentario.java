package PostRedeSocial;

public class Comentario {
    
    private String textoComentario;

    public Comentario(){

    }
    
    public Comentario(String textoComentario){
        this.textoComentario = textoComentario;
    }

    public String getTextoComentario() {
        return this.textoComentario;
    }

    public void setTextoComentario(String textoComentario) {
        this.textoComentario = textoComentario;
    }
     
}
