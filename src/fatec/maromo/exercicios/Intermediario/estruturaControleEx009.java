package fatec.maromo.exercicios.Intermediario;
import java.util.Scanner;
/*
Solicite 5 números e exiba a soma e a média
 */
public class estruturaControleEx009 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double grade=0;
        for (int i=1; i<=5; i++){
            System.out.println("nota");
            double nota = x.nextDouble();
            grade += nota;
        }
        System.out.println(grade);
        System.out.println(grade/5);
    }
}
