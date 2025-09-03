package maromo;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        /*
        Desenvolva um programa que colete as seguintes informações do usuário:
        Nome (use um vetor de char)
        Idade (inteiro)
        Altura em metros (ponto flutuante, ex: 1.75) Ao final, exiba uma frase única contendo todas as
        informações coletadas. Exemplo: "O(a) usuário(a) [Nome] tem [Idade] anos e mede [Altura]m de altura."
         */

        Scanner x = new Scanner(System.in);
        System.out.println("Input name");
        String name = x.nextLine();
        System.out.println("Input age");
        byte age = x.nextByte();
        System.out.println("Input height");
        double height = x.nextDouble();
        System.out.println("O(a) usuário(a) " +name+" tem "+age+" ano e mede "+height+"m de altura");


    }
}
