package Resolucao_atividade.questao_6;

import Resolucao_atividade.Pessoa;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class OrdenarPessoas {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Ana", 28, "111.111.111-11"));
        pessoas.add(new Pessoa("Bruno", 19, "222.222.222-22"));
        pessoas.add(new Pessoa("Carla", 35, "333.333.333-33"));
        pessoas.add(new Pessoa("Diego", 22, "444.444.444-44"));

        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));

        System.out.println("Por idade:");

        for (Pessoa pessoa : pessoas) {
            System.out.println(
                pessoa.getNome() + ", " +
                pessoa.getIdade() + " anos (CPF " +
                pessoa.getCpf() + ")"
            );
        }

        pessoas.sort(Comparator.comparing(Pessoa::getNome));

        System.out.println("\nPor nome:");

        for (Pessoa pessoa : pessoas) {
            System.out.print(pessoa.getNome() + ", ");
        }
    }
}