package maromo.fatec.atividades;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args){
        //Escreva um programa que pergunte o nome do usuário e, em seguida, exiba uma mensagem de boas-vindas
        //personalizada na tela, como "Olá, [Nome]! Seja bem-vindo(a)!".

        Scanner x = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = x.nextLine();
        System.out.println("Bem vinda " + name);
    }

}
