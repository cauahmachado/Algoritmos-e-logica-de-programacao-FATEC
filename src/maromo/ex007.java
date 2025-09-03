package maromo;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
       //Escreva um programa que leia os valores da base e da altura de um retângulo, calcule a sua área (Area = base
        //* altura) e exiba o resultado

        Scanner x = new Scanner(System.in);
        System.out.println("Input base");
        double base = x.nextDouble();
        System.out.println("Input height");
        double height = x.nextDouble();
        System.out.println("A área do retângulo é de "+(base*height));

    }
}
