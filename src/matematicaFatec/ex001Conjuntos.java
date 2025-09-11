package matematicaFatec;

import java.util.HashSet;
import java.util.Set;

public class ex001Conjuntos {
    public static void main(String[] args) {


        Set<Integer> conjuntoU = new HashSet<>();
        conjuntoU.add(0);
        conjuntoU.add(1);
        conjuntoU.add(2);
        conjuntoU.add(3);
        conjuntoU.add(4);
        conjuntoU.add(5);
        conjuntoU.add(6);
        conjuntoU.add(7);
        conjuntoU.add(8);
        conjuntoU.add(9);

        // Criando dois conjuntos
        Set<Integer> conjuntoA = new HashSet<>();
        conjuntoA.add(2);
        conjuntoA.add(3);
        conjuntoA.add(5);
        conjuntoA.add(7);

        Set<Integer> conjuntoB = new HashSet<>();
        conjuntoB.add(1);
        conjuntoB.add(2);
        conjuntoB.add(3);
        conjuntoB.add(8);

        // União (A U B)
        Set<Integer> uniao = new HashSet<>(conjuntoA); // copia A
        uniao.addAll(conjuntoB); // adiciona tudo de B
        //intersecção de A com B
        Set<Integer> interseccao = new HashSet<>(conjuntoA);
        interseccao.retainAll(conjuntoB);
        //A\B
        Set<Integer> remover = new HashSet<>(conjuntoA);
        remover.removeAll(conjuntoB);
        //A^C
        Set<Integer> complementoA = new HashSet<>(conjuntoU);
        complementoA.removeAll(conjuntoA);
        //diferença simetrica
        Set<Integer> apenasA = new HashSet<>(conjuntoA);
        apenasA.removeAll(conjuntoB); // só o que está em A
        Set<Integer> apenasB = new HashSet<>(conjuntoB);
        apenasB.removeAll(conjuntoA); // só o que está em B
        Set<Integer> diferencaSimetrica = new HashSet<>(apenasA);
        diferencaSimetrica.addAll(apenasB); // junta os dois

        // Exibindo os resultados
        System.out.println("Conjunto U" + conjuntoU);
        System.out.println("Conjunto A: " + conjuntoA);
        System.out.println("Conjunto B: " + conjuntoB);
        System.out.println("União (A U B): " + uniao);
        System.out.println("Intersecção(A∩B): " + interseccao);
        System.out.println("Remover (A/B): " + remover);
        System.out.println("Complemento de A (A^c):" + complementoA);
        System.out.println("Diferenã simetrica: " + diferencaSimetrica);
    }


}
