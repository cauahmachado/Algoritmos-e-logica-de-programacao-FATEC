package programacaoBasica;

import java.util.Scanner;

public class exercicio004 {
    public static void main(String[] args){
        /*
        Escreva um programa Java para imprimir os resultados das seguintes operações.
        Dados de teste:
        a. -5 + 8*6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8% 3
        */

        double a = -5 + 8 * 6;
        double b = (55+9)%9;
        double c = 20+(-3*5)/8;
        double d = 5 + 15 / 3 * 2 - 8%3;
        System.out.println("Exercício 4° ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        //Escreva um programa Java que receba dois números como entrada e exiba o produto de dois números.

        Scanner x = new Scanner(System.in);
        System.out.println("Exercício 5°");
        System.out.println("Input first number");
        double n1 = x.nextDouble();
        System.out.println("Input second number");
        double n2 = x.nextDouble();

        System.out.println(n2*n1);

        //Escreva um programa Java para imprimir a soma (adição), multiplicar, subtrair, dividir e o resto de dois números.

        Scanner y = new Scanner(System.in);
        System.out.println("Input your first number ");
        double num1 = y.nextDouble();
        System.out.println("Input your second number");
        double num2 = y.nextDouble();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
    }
}
