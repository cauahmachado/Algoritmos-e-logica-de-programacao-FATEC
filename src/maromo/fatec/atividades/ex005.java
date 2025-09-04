package maromo.fatec.atividades;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
       //Crie um programa que leia um número inteiro e mostre na tela o seu antecessor e o seu sucessor. Exemplo:
        //Entrada: 10 Saída: "O antecessor de 10 é 9 e o sucessor é 11."

        Scanner x = new Scanner(System.in);
        System.out.println("Input first number");
        int n1 = x.nextInt();
        System.out.println("O antecessor de "+n1+" é "+(n1-1)+ " e o seu sucessor é "+(n1+1));


    }
}
