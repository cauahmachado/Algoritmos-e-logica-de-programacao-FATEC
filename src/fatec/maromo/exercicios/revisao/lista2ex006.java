package fatec.maromo.exercicios.revisao;
import java.util.Scanner;

/*
Faça um programa em C utilizando a estrutura if-else que receba o código de um
produto e mostre sua classificação conforme a tabela abaixo:
Código Classificação
1 Alimento não perecível
2, 3, 4 Alimento perecível
5, 6 Vestuário
7 Higiene pessoal
8, 9,10 Utensílios domésticos
Outro Código inválido
 */

public class lista2ex006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira código");
        int codigo = scan.nextInt();
        System.out.println("Classificação:");
        if (codigo == 1) {
            System.out.println("Alimento não perecível");
        } else if (codigo == 2 || codigo == 3 || codigo == 4) {
            System.out.println("Alimento perecível");
        } else if (codigo == 5 || codigo == 6) {
            System.out.println("Vestuário");
        } else if (codigo == 7) {
            System.out.println("Higiene pessoal");
        } else if (codigo == 8 || codigo == 9 || codigo == 10) {
            System.out.println("Utensílios domésticos");
        } else System.out.println("Código Inválido");
    }
}
