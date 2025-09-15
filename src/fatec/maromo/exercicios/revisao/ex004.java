package fatec.maromo.exercicios.revisao;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double peso = scan.nextDouble();
        double altura = scan.nextDouble();
        double imc = peso/(altura*altura);
        if (imc<18.5){
            System.out.printf("Seu IMC é %.2f. Abaixo do peso",imc);
        }else if (imc>=18.5 && imc<=25){
            System.out.printf("Seu IMC é %.2f. Peso normal", imc);
        } else if (imc>=25 && imc<30) {
            System.out.printf("Seu IMC é %.2f. Excesso de peso", imc);
        } else if (imc>=30&&imc<35) {
            System.out.printf("Seu IMC é %.2f. Obesidade classe I", imc);
        } else if (imc>=35&&imc<40) {
            System.out.printf("Seu IMC é %.2f. Obesidade classe II", imc);

        }else System.out.printf("Seu IMC é %.2f. Obesidade classe III", imc);

    }
}
