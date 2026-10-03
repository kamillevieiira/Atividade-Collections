package Resolucao_atividade.questao_15;

import java.util.HashMap;

public class App {
  public static void main(String[] args) {

    HashMap<Integer, String> dias = new HashMap<>();

    dias.put(1, "Segunda-feira");
    dias.put(2, "Terça-feira");
    dias.put(3, "Quarta");
    dias.put(4, "Quinta-feira");
    dias.put(5, "Sexta-feira");

    System.out.println("Antes: " + dias);

    dias.replace(3, "Quarta-feira");

    System.out.println("Depois: " + dias);

    dias.replace(6, "Sábado");

    System.out.println("Chave 6 existe? " + dias.containsKey(6));
  }
}
