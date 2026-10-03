package Resolucao_atividade.questao_11;

import java.util.HashMap;

public class App {
  public static void main(String[] args) {

    HashMap<String, Integer> pessoas = new HashMap<>();

    pessoas.put("João", 30);
    pessoas.put("Maria", 25);
    pessoas.put("Pedro", 41);

    pessoas.forEach((nome, idade) -> System.out.println(nome + " tem " + idade + " anos"));
  }
}
