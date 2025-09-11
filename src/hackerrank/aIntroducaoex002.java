package hackerrank;
import java.util.Scanner;
/*
 * Este programa usa a função printf do Java para formatar textos.
 * O objetivo é formatar a entrada para que a saída fique com duas colunas,
 * tudo alinhado e organizado.
 *
 * O que o programa faz:
 * 1. Lê uma palavra e um número.
 * 2. Formata a palavra:
 * - Ela fica na primeira coluna.
 * - Ocupa 15 espaços.
 * - Fica alinhada à esquerda.
 *
 * 3. Formata o número:
 * - Ele fica na segunda coluna.
 * - Ocupa 3 espaços.
 * - Se o número tiver menos de 3 dígitos (como 65),
 * adiciona zeros na frente (ex: 065).
 * Exemplo de como fica a saída:
 * java           100
 * cpp            065
 * python         050
 */
public class aIntroducaoex002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test=0;
        System.out.println("======================");
        for (int i=0; i<3;i++){
            String s1 = scan.next();
            int x= scan.nextInt();
            System.out.printf("%-15s%03d\n",s1, x);
        }
        System.out.println("======================");
    }
}
