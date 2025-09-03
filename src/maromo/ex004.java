package maromo;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        //Escreva um programa que leia três notas de um aluno (valores de ponto flutuante), calcule a média aritmética
        //simples e mostre o resultado na tela.

        Scanner x = new Scanner(System.in);
        System.out.println("Input grade");
        double grade1 = x.nextDouble();
        System.out.println("Input second grade");
        double grade2 = x.nextDouble();
        System.out.println("Input third grade");
        double grade3 = x.nextDouble();
        System.out.println("A média do aluno foi de " +(grade1+grade2+grade3)/3);
    }
}
