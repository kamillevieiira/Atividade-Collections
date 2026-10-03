package Resolucao_atividade.questao_12;

import java.util.HashMap;

public class App {
  public static void main(String[] args) {

    HashMap<String, Integer> pessoas = new HashMap<>();

    pessoas.put("João", 30);
    pessoas.put("Maria", 25);
    pessoas.put("Pedro", 41);

    System.out.println("João tem " + pessoas.get("João") + " anos");

    if (pessoas.containsKey("Ana")) {
      System.out.println("Ana tem " + pessoas.get("Ana") + " anos");
    } else {
      System.out.println("Ana não está cadastrada");
    }
  }
}
