package com.digitalinnovationone.collectionscourse.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        treeCapitais.put("MA", "Sao Luis");
        treeCapitais.put("PI", "Teresina");
        treeCapitais.put("CE", "Fortaleza");
        treeCapitais.put("RN", "Natal");
        treeCapitais.put("PB", "Joao Pessoa");
        treeCapitais.put("PE", "Recife");
        treeCapitais.put("AL", "Maceio");
        treeCapitais.put("SE", "Aracaju");
        treeCapitais.put("BA", "Salvador");

        System.out.println(treeCapitais);

        //Retorna a chave do registro que esta no topo da arvore
        System.out.println("treeCapitais.firstKey() = " + treeCapitais.firstKey());

        //Retorna a chave do registro que esta no final da arvore
        System.out.println("treeCapitais.lastKey() = " + treeCapitais.lastKey());

        //Retorna a chave do elemento anterior à chave enviada por parametro
        System.out.println("treeCapitais.lowerKey(\"PB\") = " + treeCapitais.lowerKey("PB"));

        //Retorna a chave do elemento posterior à chave enviada por parametro
        System.out.println("treeCapitais.higherKey(\"PB\") = " + treeCapitais.higherKey("PB"));

        //Retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

        //Retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());

        //Retorna a primeira capital abaixo da parametrizada na arvore
        System.out.println(treeCapitais.lowerEntry("MA").getKey() + "-" + treeCapitais.lowerEntry("MA").getValue());

        //Retorna a capital acima da parametrizada na arvore
        System.out.println(treeCapitais.higherEntry("RN").getKey() + "-" + treeCapitais.higherEntry("RN").getValue());

        //Remove o primeiro chave-valor da arvore
        Map.Entry<String, String> firstEntry =  treeCapitais.pollFirstEntry();

        //Remove o ultimo chave-valor da arvore
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();

        System.out.println("firstEntry = " + firstEntry);
        System.out.println("lastEntry = " + lastEntry);
        System.out.println(treeCapitais);

        //Navega em todas as chaves do iterator
        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("--> " + key + "-" + treeCapitais.get(key));
        }

        for (String capital: treeCapitais.keySet() ) {
            System.out.println(capital + "-" + treeCapitais.get(capital));
        }

        for(Map.Entry<String, String> capital: treeCapitais.entrySet()) {
            System.out.println("----> " + capital.getKey() + "-" + capital.getValue());
        }
    }
}
