package Resolucao_atividade.questao_16;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {

    List<String> nomes = new ArrayList<>();

    nomes.add("Ana");
    nomes.add("Bruno");
    nomes.add("Ana");
    nomes.add("Carla");
    nomes.add("Bruno");
    nomes.add("Diego");

    List<String> semRepetidos = new ArrayList<>();

    for (String nome : nomes) {
      if (!semRepetidos.contains(nome)) {
        semRepetidos.add(nome);
      }
    }

    System.out.println(semRepetidos);
  }
}