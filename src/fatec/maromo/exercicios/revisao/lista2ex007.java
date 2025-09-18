package fatec.maromo.exercicios.revisao;
import java.util.Scanner;
//Resolva o exercício 6 utilizando a estrutura switch-case.

public class lista2ex007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira código");
        int codigo = scan.nextInt();
        System.out.println("Classificação");
        switch (codigo){
            case 1:
                System.out.println("Alimento não perecível");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Alimento perecível");
                break;
            case 5:
            case 6:
                System.out.println("Vestuário");
                break;
            case 7:
                System.out.println("Higiene pessoal");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Utensílios domésticos");
                break;
            default:
                System.out.println("Código inválido");

        }
    }
}
