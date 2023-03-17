package Trabalhador_Contratos;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;


public class Principal {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        
        System.out.print("Qual é o nome do departamento? ");
        String colaboradorDepartamento = scan.nextLine();

        System.out.println("Digite os dados do colaborador");
        System.out.print("Nome: ");
        String colaboradorNome = scan.nextLine();
        System.out.print("Nível: ");
        String colaboradorNivel = scan.nextLine();
        System.out.print("Salário base: ");
        Double colaboradorSalarioBase = scan.nextDouble();
        //O método valueOf é um método estático que recebe um argumento de qualquer tipo e o converte em um objeto String
        //Por isso o dado do tipo Enum de NivelTrabalho foi convertido em um objeto String
        //Dentro da classe existirá um outro Objeto do tipo Departamento - por isso foi instanciado - com valor próprio
        Colaborador novoColaborador = new Colaborador(colaboradorNome, NivelTrabalho.valueOf(colaboradorNivel), colaboradorSalarioBase, new Departamento(colaboradorDepartamento));

        System.out.println("Informe quantos contratos você deseja adicionar: ");
        int numeroContratos = scan.nextInt();

        //Para ir adicionando conforme for o número de contratos que a pessoa escolheu - utiliza-se um laço for
        for(int i = 1; i <= numeroContratos; i++){
            System.out.println("Insira o contrato: ");
            System.out.println("Data: ");
            Date contratoData = sdf.parse(scan.next());
            System.out.println("Valor por hora: ");
            double valorPorHora = scan.nextDouble();
            System.out.println("Duração (horas): ");
            int horas = scan.nextInt();
            ContrataPorHoras contrato = new ContrataPorHoras(contratoData, valorPorHora, horas);
            novoColaborador.AdicionarContrato(contrato); 
            //Cada novo contrato será adicionado à lista de contratos que está vinculada ao Colaborador
        }

        System.out.println("Informe o mês e o ano para calcular o salário (MM/YYYY): ");
        String mesEAno = scan.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2)); //Recorta a string inciando em 0 e finalizando na posição 2
        int ano = Integer.parseInt(mesEAno.substring(3)); //Recorta da posição 3 em diante
        System.out.println("Nome: " + novoColaborador.getNome());
        //Acessa primeiro uma classe para depois acessar o outro atributo da classe interna
        System.out.println("Departamento: " + novoColaborador.getDepartamento().getNomeDepartamento()); 
        System.out.println("Ganho total: " + String.format("%2.f", novoColaborador.GanhosAno(ano, mes)));

        scan.close();
    }
}
