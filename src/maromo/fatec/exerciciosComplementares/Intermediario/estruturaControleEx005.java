package maromo.fatec.exerciciosComplementares.Intermediario;
import java.util.Scanner;

/*
Leia um numero e determine se ele é positivo, negativo ou zero
 */
public class estruturaControleEx005 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Input number");
        double n = x.nextDouble();
        if (n>0){
            System.out.println(n+" é positivo");
        } else if (n<0) {
            System.out.println(n+" é negativo");
        }else System.out.println(n+" é zero");
    }
}
