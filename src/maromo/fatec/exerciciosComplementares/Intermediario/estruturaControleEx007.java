package maromo.fatec.exerciciosComplementares.Intermediario;

import java.util.Scanner;

/*
Crie um meno interativo com as opções de: Soma, Subtração, e sair
 */
public class EstruturaControleEx007 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Number");
        int n = x.nextInt();
        x.nextLine();
        System.out.println("Quer somar, subtrair ou sair");
        String operacao = x.nextLine();
        System.out.println("Number");
        int n2 = x.nextInt();


        switch (operacao){
            case "+":
            case "soma":
            case "Soma":
            case "Somar":
            case "somar":
                System.out.println("Soma selecionado");
                System.out.println(n+" + "+n2+" = "+(n+n2));
                break;
            case "-":
            case "subtração":
            case "Subtração":
            case "subtrair":
            case "Subtrair":
                System.out.println("Subtração selecionado");
                System.out.println(n+" - "+n2+" = "+(n+n2));
                break;
            case "sair":
            case "Sair":
                System.out.println("Sair selecionado");
                break;
            default:
                System.out.println("Invalido");
        }

    }
}
