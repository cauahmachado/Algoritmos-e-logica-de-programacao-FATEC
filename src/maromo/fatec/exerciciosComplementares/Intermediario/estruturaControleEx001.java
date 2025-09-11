package maromo.fatec.exerciciosComplementares.Intermediario;
import java.util.Scanner;

/*
Crie um programa que determine se um número é par ou impar usando if
 */
public class estruturaControleEx001 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Input number");
        int n = x.nextInt();
        if (n%2==0){
            System.out.println("par");
        }else System.out.println("impar");

    }
}
