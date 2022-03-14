package com.digitalinnovationone.collectionscourse.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafael", 23);
        estudantes.put("Pedro", 44);
        System.out.println(estudantes);

        boolean temMariana = estudantes.containsKey("Mariana");
        System.out.println("tem Mariana = " + temMariana);

        estudantes.put("Pedro", 55);
        System.out.println(estudantes);

        Integer removido = estudantes.remove("Mariana");
        System.out.println(removido);
        System.out.println(estudantes);

        temMariana = estudantes.containsKey("Mariana");
        System.out.println("tem Mariana = " + temMariana);

        System.out.println(estudantes.get("Rafael"));
        System.out.println(estudantes);

        int tamanho = estudantes.size();
        System.out.println("tamanho: " + tamanho);

        for (String key: estudantes.keySet()) {
            String chave = key;
            int valor = estudantes.get(key);
            System.out.println(chave + " - " + valor);
        }

        for(Map.Entry<String, Integer> entry : estudantes.entrySet()) {
            System.out.println("---> " + entry.getKey() + " -- " + entry.getValue());
        }

    }
}
