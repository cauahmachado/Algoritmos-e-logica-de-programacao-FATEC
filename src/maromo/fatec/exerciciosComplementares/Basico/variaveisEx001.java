package maromo.fatec.exerciciosComplementares.Basico;

import java.util.Scanner;

public class variaveisEx001 {
    public static void main(String[] args) {
        //leia um número inteiro e exiba o dobro do valor.
        Scanner x = new Scanner(System.in);
        System.out.println("Input number");
        int n = x.nextInt();
        System.out.println("Double = "+(n*2));

    }
}
