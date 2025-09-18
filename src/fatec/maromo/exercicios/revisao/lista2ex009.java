package fatec.maromo.exercicios.revisao;

import java.util.Scanner;

/*
*Faça um programa em C que receba as notas de três avaliações de um aluno, calcule sua
média e informe:
• Média maior ou igual a 7: "Aprovado"
Lista de Exercícios – Prof. Maromo
Aula: 17/09/2025
• Média maior ou igual a 3 e menor que 7: "Você está em exame". Nesse caso, leia a nota
do exame, calcule a média final como (média + nota do exame)/2 e informe:
▪ Média final maior ou igual a 5: "Aprovado no exame"
▪ Média final menor que 5: "Reprovado no exame"
• Média menor que 3: "Reprovado sem direito a exame"
 */
public class lista2ex009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Notas 1, 2 e 3");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 3) {
            System.out.println("Você está no exame");
            System.out.println("Nota do exame");
            double notaexame = scan.nextDouble();
            double mediafinal = (notaexame + media) / 2;
            if (mediafinal >= 5) {
                System.out.println("Aprovado no exame");
            } else System.out.println("Reprovado no exame");

        } else System.out.println("Reprovado sem direito a exame");

    }
}
