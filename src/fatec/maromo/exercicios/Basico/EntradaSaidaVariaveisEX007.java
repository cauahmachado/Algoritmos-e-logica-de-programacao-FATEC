package fatec.maromo.exercicios.Basico;
import java.util.Scanner;

/*
*Escreva um programa que leia os valores da base e da altura de um retângulo,
* calcule a sua área (Area = base * altura) e exiba o resultado
 */

public class EntradaSaidaVariaveisEX007 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("base");
        double base = x.nextDouble();
        System.out.println("altura");
        double height = x.nextDouble();
        System.out.println("A área do retângulo é de "+(base*height));
    }
}
