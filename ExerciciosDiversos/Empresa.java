package ExerciciosDiversos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos funcionários serão registrados? ");
        int numeroFuncionarios = scan.nextInt();

        List<ColaboradorEmpresa> novosColaboradores = new ArrayList<>();

        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.printf("Colaborador #%d \n", i);
            System.out.print("Id: ");
            Integer id = scan.nextInt();
            System.out.print("Nome: ");
            scan.nextLine();
            String nome = scan.next();
            System.out.print("Salario: ");
            Double salario = scan.nextDouble();

            // Adiciono um novo objeto dentro da lista
            novosColaboradores.add(new ColaboradorEmpresa(id, nome, salario));
        }

        // System.out.print("Você gostaria de incrementar o salário de algum colaborador? 0 - Não | 1 - Sim ");
        // int resposta = scan.nextInt();

        System.out.print("Coloque o id do funcionário que terá o salário incrementado:  ");
        Integer idIncrementado = scan.nextInt();
        Integer posicaoId = posicaoIdLista(novosColaboradores, idIncrementado);
        if (posicaoId == null) {
            System.out.print("Essa posição não existe");
        } else {
            System.out.print("Informe a porcentagem: ");
            Double porcentagem = scan.nextDouble();
            novosColaboradores.get(posicaoId).aumentarSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de colaboradores:");
        for (ColaboradorEmpresa obj : novosColaboradores) {
            System.out.println(obj);
        }

        scan.close();
    }

    public static Integer posicaoIdLista(List<ColaboradorEmpresa> listaFuncionarios, int id) {

        for (int i = 0; i < listaFuncionarios.size(); i++) {
            if (listaFuncionarios.get(i).getId() == id) {
                return i;
            }
        }
        // Como está sendo usado Integer é possível retornar o valor null, já que ele é
        // aceito pelo tipo wrapper class
        return null;

    }
}
