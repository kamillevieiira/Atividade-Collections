package Resolucao_atividade.questao_13;

import java.util.TreeMap;

public class App {
  public static void main(String[] args) {
    TreeMap<String, Integer> pessoas = new TreeMap<>();

    pessoas.put("Rafael", 33);
    pessoas.put("Beatriz", 27);
    pessoas.put("Lucas", 19);
    pessoas.put("Amanda", 45);
    pessoas.put("Gustavo", 22);

    for (String nome : pessoas.keySet()) {
      System.out.println(nome + ": " + pessoas.get(nome));
    }

    System.out.println("Primeira: " + pessoas.firstKey() +
        " | Última: " + pessoas.lastKey());
  }
}
