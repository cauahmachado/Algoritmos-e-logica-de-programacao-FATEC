package maromo.fatec.exerciciosComplementares.revisao;

import java.util.Objects;
import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        scan.nextLine();
        String operacao = scan.nextLine();
        if (n2 == 0 && Objects.equals(operacao, "/")) {
            System.out.println("Divisão invalida");
        } else {
            switch (operacao) {
                case "+":
                    System.out.println(n1 + n2);
                    break;
                case "-":
                    System.out.println(n1 - n2);
                    break;
                case "*":
                case "x":
                    System.out.println(n1 * n2);
                    break;
                case "/":
                    System.out.println(n1 / n2);
                    break;
                default:
                    System.out.println("Operação invalida");
            }
        }
    }
}
