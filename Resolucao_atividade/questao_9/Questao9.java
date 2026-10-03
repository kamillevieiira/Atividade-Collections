package Resolucao_atividade.questao_9;

import java.util.HashSet;
import java.util.Set;

public class Questao9 {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);

        if (numeros.contains(15)) {
            System.out.println("15 está no conjunto");
        }

        if (!numeros.contains(18)) {
            System.out.println("18 não está no conjunto");
        }
    }
}
