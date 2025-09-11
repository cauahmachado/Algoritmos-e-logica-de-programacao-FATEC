package maromo.fatec.exerciciosComplementares.Basico;
import java.util.Scanner;

/*
Cire um fluxograma e um programa para calcular a média ponderada de duas notas de um aluno.
a nota 1 tem peso 3 a nota 2 tem peso 7
 */
public class operadoresEx005 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Nota 1");
        double grade = x.nextDouble();
        System.out.println("Grade 2");
        double grade2 = x.nextDouble();
        double media = (grade*3 + grade2*7)/(3+7);
        System.out.println(media);
    }


}
