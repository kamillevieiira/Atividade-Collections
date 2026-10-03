package Resolucao_atividade.questao_5;

import java.util.LinkedList;

public class ArmazenarLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        numeros.addFirst(0);
        numeros.addLast(6);

        System.out.println(numeros);

        System.out.println("Primeiro: " + numeros.getFirst() + " | Último: " + numeros.getLast());
    }
}
