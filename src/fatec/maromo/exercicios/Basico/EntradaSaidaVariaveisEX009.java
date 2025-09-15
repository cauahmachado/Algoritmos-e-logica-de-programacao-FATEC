package fatec.maromo.exercicios.Basico;
import java.util.Scanner;

/*
*Faça um programa que leia o salário de um funcionário e o percentual de reajuste.
* Calcule e exiba o valor do novo salário.
*/
public class EntradaSaidaVariaveisEX009 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite salario: ");
        double salario = x.nextDouble();
        System.out.println("Digite o percentual de reajuste ");
        double reajuste = x.nextDouble();
        double salarioAtual = salario+(salario*(reajuste/100));
        System.out.println("O salário atual após reajuste é de "+ salarioAtual);
    }
}
