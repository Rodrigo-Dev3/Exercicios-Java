public class Principal {
    public static void main(String[] args) {
        
        Contribuinte novo = new PessoaFisica("Maria", 30000.0, 500.0);

        System.out.print(novo.GastoComImposto());
    }
}
