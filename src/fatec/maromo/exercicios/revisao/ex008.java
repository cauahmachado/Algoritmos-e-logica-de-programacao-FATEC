package fatec.maromo.exercicios.revisao;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome de usuário");
        String user = scan.nextLine();
        System.out.println("Senha");
        String senha = scan.nextLine();

        switch (senha){
            case "admin123":
                System.out.printf("Bem vindo, %s! Nivel de acesso: Administrador", user);
                break;
            case "user456":
                System.out.printf("Bem vindo, %s ! Nível de acesso: Usuário Padrão", user);
        }
    }
}
