package maromo.fatec.exerciciosComplementares.revisao;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char cor = scan.next().toUpperCase().charAt(0);
        switch (cor){
            case 'R':
                System.out.println("O código hexadecimal para vermelho é #FF0000");
                break;
            case 'V':
                System.out.println("O código hexadecimal para o Verde é #00FF00 ");
                break;
            case 'A':
                System.out.println("O código hexadecimal para Azul é #0000FF");
                break;
            case 'P':
                System.out.println("O código hexadecimal para Preto é #000000");
                break;
            default:
                System.out.println("Cor não cadastrada");

        }
    }
}
