package fatec.maromo.exercicios.revisao;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();
        int mes = scan.nextInt();
        int ano = scan.nextInt();
        if (ano < 0 || mes <= 0) {
            System.out.println("Data invalida");
        } else if (((((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) && mes == 2 && dia > 0 && dia <= 29))) {
            System.out.println("Data valida");
        } else if ((mes == 1 || mes == 5 || mes == 7 || mes == 10 || mes == 12) && dia <= 0 || dia > 31) {
            System.out.println("Data invalida");
        } else if ((mes == 4 || mes == 6 || mes == 8 || mes == 9) && dia <= 0 || dia > 30) {
            System.out.println("Data invalida");
        } else if ((mes == 3 || mes == 11) && dia <= 0 || dia > 29) {
            System.out.println("Data invalida");
        } else if (mes == 2 && dia <= 0 || dia > 28) {
            System.out.println("Data invalida");
        } else if (mes > 12) {
            System.out.println("Data invalida");
        } else System.out.println("Data valida");


    }

}

