package ExerciciosDiversos;

import java.util.Scanner;

public class Colaborador {
    
    public String nome;
    public Double salarioBruto;
    public Double taxaSalarioBruto;

    public double salario() {
        return salarioBruto - taxaSalarioBruto;
    }

    public void acrescentarSalario(double percentual) {
            salarioBruto += salarioBruto * percentual / 100.0;
    }

    public String toString() {
            return nome + ", R$ " + String.format("%.2f", salario());
    }

}
