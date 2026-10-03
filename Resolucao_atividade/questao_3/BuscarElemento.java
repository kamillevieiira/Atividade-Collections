package Resolucao_atividade.questao_3;

import java.util.ArrayList;
import java.util.List;

public class BuscarElemento {
  public static void main(String[] args) {
    List<String> frutas = new ArrayList<>();

    frutas.add("maçã");
    frutas.add("banana");
    frutas.add("laranja");
    frutas.add("abacaxi");

    if (frutas.indexOf("banana") != -1) {
      System.out.println("'banana' encontrada no índice " + frutas.indexOf("banana"));
    }

    if (frutas.indexOf("uva") == -1) {
      System.out.println("'uva' não foi encontrada na lista");
    }
  }
}
