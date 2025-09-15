package fatec.maromo.exercicios.Basico;
import java.util.Scanner;

/*
*Escreva um programa que leia três notas de um aluno (valores de ponto flutuante),
* calcule a média aritmética
* simples e mostre o resultado na tela.
*/

public class EntradaSaidaVariaveisEX004 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Nota 1");
        double grade1 = x.nextDouble();
        System.out.println("Nota 2");
        double grade2 = x.nextDouble();
        System.out.println("Nota 3");
        double grade3 = x.nextDouble();
        System.out.println("A média do aluno foi de " +(grade1+grade2+grade3)/3);
    }
}
