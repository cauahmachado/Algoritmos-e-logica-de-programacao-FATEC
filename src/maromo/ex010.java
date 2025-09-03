package maromo;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        //Desenvolva um programa que leia uma temperatura em graus Celsius (°C) e a converta para graus Fahrenheit
        //(°F). A fórmula de conversão é: F = (C * 9/5) + 32

        Scanner x = new Scanner(System.in);
        System.out.println("Digite a temperatura em °C");
        double temp = x.nextDouble();
        System.out.println("A temperatura "+temp+" em Fahrenheit é de "+((temp*9/5)+32)+"°F");

    }
}
