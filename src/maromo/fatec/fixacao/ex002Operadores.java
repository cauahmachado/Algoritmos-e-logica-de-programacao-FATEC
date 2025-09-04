package maromo.fatec.fixacao;

public class ex002Operadores {
    public static void main(String[] args) {
        //crie um programa para vereficar se um número é par ou ímpar
        int num=5;
        int num2=4;
        if (num%2==0){
            System.out.println("par");
        }else System.out.println("impar");

        System.out.println(num2%2==0?"par":"impar");
    }
}
