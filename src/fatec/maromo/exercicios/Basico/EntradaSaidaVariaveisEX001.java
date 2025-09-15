package fatec.maromo.exercicios.Basico;
import java.util.Scanner;
/*
*       Escreva um programa que pergunte o nome do usuário e, em seguida,
*       exiba uma mensagem de boas-vindas personalizada na tela,
*       como "Olá, [Nome]! Seja bem-vindo(a)!".
*/

public class EntradaSaidaVariaveisEX001 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = x.nextLine();
        System.out.printf("Olá, %s! Seja bem-vindo(a)", name);
    }
}
