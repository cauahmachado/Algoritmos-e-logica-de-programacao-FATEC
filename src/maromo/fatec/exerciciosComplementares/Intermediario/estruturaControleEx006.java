package maromo.fatec.exerciciosComplementares.Intermediario;

import java.lang.classfile.instruction.SwitchCase;

/*
Solicite três numeros e determine o maior e o menor deles
 */
public class EstruturaControleEx006 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 100;
        int n3 = 24;

        if (n1<n2 && n1<n3){
            System.out.println(n1 +" é o menor");
        } else if (n2<n1 && n2<n3) {
            System.out.println(n2+" é o menor");
        }else System.out.println(n3+" é o menor");

    }





}
