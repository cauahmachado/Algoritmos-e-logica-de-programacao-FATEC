package maromo.fatec.atividades;

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        //Faça um programa que leia o salário de um funcionário e o percentual de reajuste. Calcule e exiba o valor do
        //novo salário.
        Scanner x = new Scanner(System.in);
        System.out.println("Digite salario: ");
        double salario = x.nextDouble();
        System.out.println("Digite o percentual de reajuste ");
        double reajuste = x.nextDouble();
        double salarioAtual = salario+(salario*(reajuste/100));
        System.out.println("O salário atual após reajuste é de "+ salarioAtual);
    }
}
