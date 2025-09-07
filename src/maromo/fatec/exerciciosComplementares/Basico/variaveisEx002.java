package maromo.fatec.exerciciosComplementares.Basico;

import java.util.Scanner;

/*
Solicite o nome e a idade de uma pessoa e exiba:
"Nome tem x anos"
 */
public class variaveisEx002 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Name");
        String name = x.nextLine();
        System.out.println("Age");
        byte age = x.nextByte();
        System.out.println(name+ " tem "+age+" anos");



    }
}
