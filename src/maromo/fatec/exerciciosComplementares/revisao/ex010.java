package maromo.fatec.exerciciosComplementares.revisao;
/*
Crie um programa que leia um valor e um caractere que representa a unidade
original(C para Celsius, F para Fahrenheit, K para Kelvin)
Usando switch, converta o vlaor para as outras duas unidades e exiba o resultado.
 */

import java.util.Locale;
import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double temp = scan.nextDouble();
       scan.nextLine();
       String tipo = scan.nextLine().toLowerCase(Locale.ROOT);

       switch (tipo){
           case "c":
               System.out.println(((temp*9/5)+32) + " F "+ (temp+273.15)+" K ");
               break;
           case "f":
               System.out.println(((temp-32)*5/9) + " C "+ ((temp-32)*5/9+273.15) + "K");
               break;
           case "k":
               double tempc = temp-273.15;
               double tempf = (temp-273.15)*9/5+32;
               System.out.printf("%.2f C  %.2f F", tempc , tempf );

       }


    }
}
