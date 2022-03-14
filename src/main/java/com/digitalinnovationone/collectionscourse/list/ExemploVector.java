package com.digitalinnovationone.collectionscourse.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Volei");
        esportes.add("Ping-pong");
        esportes.add("Basquetebol");
        esportes.add("Handbol");

        System.out.println(esportes);

        esportes.set(2, "Tenis de mesa");
        System.out.println(esportes);

        esportes.remove(2);
        System.out.println(esportes);

        System.out.println("Traga o item 3 da lista: " + esportes.get(3));

        for (String esporte: esportes) {
            System.out.println("--> " + esporte);
        }

    }
}
