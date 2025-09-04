package maromo.fatec.fixacao;

import java.util.Scanner;

/*
Crie um floxogram e um programa para calcular a seguinte expressão A=A+B*C.
Os valroes devem ser lidos do teclado*/
public class ex004Operadores {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Input a number");
        int a = x.nextInt();
        System.out.println("Input a number");
        int b = x.nextInt();
        System.out.println("Input a number");
        int c = x.nextInt();

        a = a + (b*c);
        System.out.println(a);
    }
}
