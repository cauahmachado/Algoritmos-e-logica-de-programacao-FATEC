package fatec.maromo.exercicios.revisao;
import java.util.Scanner;

/*
Leia a idade de uma pessoa e use switch ou if/else if para classificá-las nas seguintes categorias
 */

public class ex009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Age");
        int age = scan.nextInt();

        switch ((age<=12 ? 1:0)+(age>12 && age<=17?2:0)+(age>=18 && age<=59?3:0)+(age>=60?4:0)){
            case 1:
                System.out.println("criança");
                break;
            case 2:
                System.out.println("Adolescente");
                break;
            case 3:
                System.out.println("Adulto");
                break;
            case 4:
                System.out.println("Idoso");
                break;

        }
    }
}
