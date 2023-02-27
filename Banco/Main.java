package Banco;

public class Main {
    public static void main(String[] args) {
        
        Infos clienteNovo = new Infos("João", 3300, 500);

        clienteNovo.DepositoConta(100);
        clienteNovo.DepositoConta(100);
        
        System.out.println(clienteNovo);

    


    }

}
