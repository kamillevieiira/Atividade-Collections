package Resolucao_atividade.questao_7;

import java.util.HashSet;
import java.util.Set;

public class EvitarDuplicacao {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(10);
        numeros.add(30);
        numeros.add(40);

        System.out.println("Conjunto: " + numeros);
        System.out.println("Tamanho: " + numeros.size());

        boolean resultado = numeros.add(10);

        System.out.println("add(10) retornou: " + resultado);
    }
}