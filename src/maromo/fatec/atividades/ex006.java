package maromo.fatec.atividades;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
      //Desenvolva um programa que leia um valor em metros e o converta para centímetros e milímetros,
      // exibindo os três valores na tela. Lembrete: 1 metro = 100 centímetros; 1 metro = 1000 milímetros.

        Scanner x = new Scanner(System.in);
        System.out.println("Input the meter");
        double meter = x.nextDouble();
        System.out.println("Valor "+meter);
        System.out.println("Em centímetros "+(meter*100));
        System.out.println("Em milimetro "+(meter*1000));

    }
}
