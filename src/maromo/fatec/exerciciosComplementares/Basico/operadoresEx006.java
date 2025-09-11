package maromo.fatec.exerciciosComplementares.Basico;
import java.util.Scanner;

public class operadoresEx006 {
    public static void main(String[] args) {
        double cotDolar = 5.46;
        Scanner x = new Scanner(System.in);

        System.out.println("Input value in dolar");
        double value = x.nextDouble();
        value *= cotDolar;
        System.out.printf("Valor em reais: %.2f%n", value);
    }
}
