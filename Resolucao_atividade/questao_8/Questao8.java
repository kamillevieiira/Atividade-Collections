package Resolucao_atividade.questao_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Questao8 {
    public static void main(String[] args) {

        Set<String> cidades = new HashSet<>();

        cidades.add("Recife");
        cidades.add("Natal");
        cidades.add("Salvador");
        cidades.add("Fortaleza");
        cidades.add("São Luís");


        for (String cidade : cidades) {
            System.out.println(cidade);
        }

      
        Iterator<String> iterator = cidades.iterator();

        while (iterator.hasNext()) {
            String cidade = iterator.next();

            if (cidade.startsWith("S")) {
                iterator.remove();
            }
        }

        System.out.println("Restantes: " + cidades);
    }
}
