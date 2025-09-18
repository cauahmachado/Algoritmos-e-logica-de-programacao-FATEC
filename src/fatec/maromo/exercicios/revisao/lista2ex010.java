package fatec.maromo.exercicios.revisao;

import java.util.Scanner;

public class lista2ex010 {
    public static void main(String[] args) {
        double valordesconto, valoracrecimo;
        String decisao;
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor do produto");
        double valor = scan.nextDouble();
        System.out.println("Digite o código da forma de pagamento (1 a 4):");
        int codigo = scan.nextInt();
        if (codigo == 1) {
            System.out.println("À vista em dinheiro ou cheque, com 10% de desconto");
            valordesconto = valor * 0.9; // 10% de desconto
            System.out.printf("Valor com desconto %.2f", valordesconto);
        } else if (codigo == 2) {
            System.out.println("Á vista com cartão de crédito, com 5% de desconto");
            valordesconto = valor * 0.95;
            System.out.printf("Valor com desconto %.2f", valordesconto);
        } else if (codigo == 3) {
            System.out.println("Em 2 vezes, preço normal(sem juros)");
            valordesconto = valor / 2;
            System.out.printf("Em 2 vezes de %.2f sem juros", valordesconto);
        } else if (codigo == 4) {
            System.out.println("Em 3 vezes, preço de etiqueta com acréscimo de 10");
            valoracrecimo = valor * 1.1;
            valordesconto = valoracrecimo / 3;
            System.out.printf("3 vezes de %.2f com acrescimo de 10", valordesconto);

        } else System.out.println("Código invalido");
    }
}
