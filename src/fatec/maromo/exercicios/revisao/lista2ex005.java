package fatec.maromo.exercicios.revisao;
import java.util.Scanner;

/*
Desenvolva um programa em C para avaliar a aprovação de um empréstimo bancário.
O programa deve solicitar três informações: valor solicitado do empréstimo, número de
parcelas e salário mensal do solicitante. O empréstimo será aprovado se o valor das
parcelas não ultrapassar 30% do salário mensal do solicitante
 */

public class lista2ex005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor solicitado do emprestimo");
        double emprestimo = scan.nextDouble();
        System.out.println("Número de parcelas");
        int numeroparcelas = scan.nextInt();
        System.out.println("Salario mensal do soliciante");
        double salariomensal = scan.nextDouble();
        double valorParcelas = emprestimo/numeroparcelas;
        double trintaporcento = salariomensal * 0.30;
        if (valorParcelas<=trintaporcento){
            System.out.println("Aprovado");
        }else System.out.println("Não aprovado");

    }
}
