package Resolucao_atividade.questao_2;

import java.util.ArrayList;
import java.util.List;

public class RemoverElemento {
  public static void main(String[] args) {
    List<Integer> numeros = new ArrayList<>();

    numeros.add(10);
    numeros.add(20);
    numeros.add(30);
    numeros.add(40);
    numeros.add(50);

    for (int i = 0; i < numeros.size(); i++){
      System.out.println(numeros.get(i));
    }

    System.out.println("");

    numeros.removeIf(numero -> numero == 30);

    for(int num : numeros){
      System.out.println(num);
    }
    

  }
}
