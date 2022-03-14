package com.digitalinnovationone.collectionscourse.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        //pode ser usado assim ao buscar de um arquivo csv,
        // a chave é a coluna e todos os valores daquela coluna do arquivo vão estar dentro da sua lista
//        Map<String, List<Integer>> campeoesMundialFifa = new HashMap<>();

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Italia", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("Franca", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        campeoesMundialFifa.put("Brasil", 6);
        System.out.println(campeoesMundialFifa);

        System.out.println("getArgentina = " + campeoesMundialFifa.get("Argentina"));

        System.out.println("Venezuela campeao mundial? = " + campeoesMundialFifa.containsKey("Venezuela"));

        //removi a Franca da lista
        campeoesMundialFifa.remove("Franca");
        System.out.println(campeoesMundialFifa);
        System.out.println("Franca campeao mundial? = " + campeoesMundialFifa.containsKey("Franca"));

        System.out.println("campeoesMundialFifa.containsValue(5) = " + campeoesMundialFifa.containsValue(5));

        System.out.println("size = " + campeoesMundialFifa.size());

        int qtdChave1 = 0;

        //Navega nos registros do mapa
        for(Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
            System.out.println("--> entry: " + entry.getKey() + " - " + entry.getValue());
            if (entry.getValue() == 1) {
                qtdChave1++;
                System.out.println("getKey para chave 1 = " + entry.getKey());
            }
        }
        System.out.println("qtdChave1 = " + qtdChave1);

        //Navega nos registros do mapa
        for (String key: campeoesMundialFifa.keySet()) {
            System.out.println("      " + key + "-" + campeoesMundialFifa.get(key));
        }

        System.out.println("contem chave Uruguai? = " + campeoesMundialFifa.containsKey("Uruguai"));
        System.out.println("contem valor 1? = " + campeoesMundialFifa.containsValue(1));

        System.out.println("size = " + campeoesMundialFifa.size());
        campeoesMundialFifa.clear();
        System.out.println("size = " + campeoesMundialFifa.size());

    }
}
