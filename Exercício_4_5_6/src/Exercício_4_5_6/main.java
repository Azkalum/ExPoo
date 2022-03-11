package Exercício_4_5_6;

import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main(String[] args) {

        List<Pessoas> pessoas = new ArrayList<Pessoas>();

        Pessoas joão = new Pessoas("João",15);
        Pessoas leandro = new Pessoas("Leandro",21);
        Pessoas paulo = new Pessoas("Paulo", 17);
        Pessoas jessica = new Pessoas("Jessica", 18);

        pessoas.add(joão);
        pessoas.add(leandro);
        pessoas.add(paulo);
        pessoas.add(jessica);

        System.out.println("Exercício 1: ");
        Pessoas maisVelhos = maisVelho(pessoas);
        System.out.println("A pessoa mais velha tem: " + maisVelhos.getIdade());

        System.out.println("Exercício 2: ");
        Pessoas menor = menorIdade(pessoas);
        System.out.println("Lista pós exclusão dos -18 é: " + menor.getIdade());

        System.out.println("Exercício 3: ");
        System.out.println("Se Jéssica estiver presente na lista, mostre sua idade: ");
        System.out.println(jessica.equals(jessica));

    }

    public static Pessoas maisVelho(List<Pessoas> pessoas){
              int velho = 0;
              int count = 0;

              for (int i = 0; i < pessoas.size(); i++){
                  if(pessoas.get(i).getIdade() > velho){
                      velho = pessoas.get(i).getIdade();
                      count = i;
                  }
        }
              return pessoas.get(count);

    }

    public static List<Pessoas> menorIdade(List<Pessoas> pessoas){
        int i;

        for (i = 0; i < pessoas.size(); i++){
            if (pessoas.get(i).getIdade() < 18){
                pessoas.remove(i);
            }
        }
        return pessoas;
    }



}
