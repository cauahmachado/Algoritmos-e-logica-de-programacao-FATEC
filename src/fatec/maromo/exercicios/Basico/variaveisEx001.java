package fatec.maromo.exercicios.Basico;
import java.util.Scanner;

//leia um número inteiro e exiba o dobro do valor.

public class variaveisEx001 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Input number");
        int n = x.nextInt();
        System.out.println("Double = "+(n*2));
    }
}
