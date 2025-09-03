package maromo;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        //Crie um programa que leia dois números inteiros digitados pelo usuário, armazene-os em variáveis, calcule a
        //soma desses números e exiba o resultado.

        Scanner x = new Scanner(System.in);
        System.out.println("Input first number");
        int n1 = x.nextInt();
        System.out.println("Input second number:");
        int n2 = x.nextInt();
        System.out.println(n1+"+"+n2+"="+(n1+n2));

    }
}
