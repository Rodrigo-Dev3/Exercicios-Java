package JogoDaVelha;

public class Campo {
    
    private char simbolo;
    
    public Campo(){
        this.simbolo = ' ';
    }

    public char getSimbolo(){
        return this.simbolo;
    }

    public void setSimbolo(char simbolo){
        //Se o espaço estiver vazio
        if(this.simbolo == ' '){
            this.simbolo = simbolo;
        }
        else{
            System.out.print("Campo já utilizado");
        }
    }
}
