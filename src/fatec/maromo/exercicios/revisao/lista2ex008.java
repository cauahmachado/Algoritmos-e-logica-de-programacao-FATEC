package fatec.maromo.exercicios.revisao;

import java.util.Scanner;

public class lista2ex008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nota 1 e 2");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double media = (nota1+nota2)/2;
        if (media==10){
            System.out.println("Aprovado com distinção");
        } else if (media>=7) {
            System.out.println("Aprovado");
        } else if (media>= 3) {
            System.out.println("Exame");
        }else {
            System.out.println("Reprovado");
        }
    }
}
