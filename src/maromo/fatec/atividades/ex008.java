package maromo.fatec.atividades;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
      //Crie um programa que leia um número inteiro e mostre o seu dobro, o seu triplo e a sua raiz quadrada. Dica:
        //Para a raiz quadrada, você precisará incluir a biblioteca math.h e usar a função sqrt().

        Scanner x = new Scanner(System.in);
        System.out.println("Digite o número");
        double n1 = x.nextDouble();
        System.out.println("O dobro de "+n1+" é "+(n1*2));
        System.out.println("O triplo de "+n1+" é "+(n1*3));
        System.out.println("A raiz quadrada de "+n1+" é "+(Math.sqrt(n1)));


    }
}
