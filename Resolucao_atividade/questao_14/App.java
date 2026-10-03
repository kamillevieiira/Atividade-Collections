package Resolucao_atividade.questao_14;

import java.util.HashMap;
import Resolucao_atividade.Pessoa;

public class App {
  public static void main(String[] args) {

    HashMap<String, Pessoa> pessoas = new HashMap<>();

    Pessoa ana = new Pessoa("Ana", 25, "111.111.111-11");
    Pessoa bruno = new Pessoa("Bruno", 19, "222.222.222-22");
    Pessoa carla = new Pessoa("Carla", 30, "333.333.333-33");

    pessoas.put("111.111.111-11", ana);
    pessoas.put("222.222.222-22", bruno);
    pessoas.put("333.333.333-33", carla);

    System.out.println("Busca: " + pessoas.get("222.222.222-22"));

    Pessoa bruna = new Pessoa("Bruna", 20, "222.222.222-22");

    Pessoa anterior = pessoas.put("222.222.222-22", bruna);

    System.out.println("Put retornou: " + anterior);
    System.out.println("Tamanho do mapa: " + pessoas.size());

  }
}
