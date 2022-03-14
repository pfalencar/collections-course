package com.digitalinnovationone.collectionscourse.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("Joao");
        nomes.add("Aline");

        System.out.println(nomes);

        nomes.set(2, "Larissa");
        System.out.println(nomes);

        Collections.sort(nomes);   //ordena por ordem alfabetica
        System.out.println(nomes);

        nomes.remove(1);
        System.out.println(nomes);

        nomes.remove("Larissa");
        System.out.println(nomes);

        int indiceDoElemento = nomes.indexOf("Pedro");
        System.out.println("indice do elemento Pedro: " + indiceDoElemento);

        int indiceDoElementoInexistente = nomes.indexOf("Regina");
        System.out.println("indice do elemento que nao tem na lista: " + indiceDoElementoInexistente);

        System.out.println(nomes.get(2));

//        nomes.get(4); //NOK   IndexOutOfBoundsException: Index 4 out of bounds for length 4

        int tamanho = nomes.size();
        System.out.println("tamanho: " + tamanho);

        boolean temMaria = nomes.contains("Maria");
        System.out.println("temMaria?: " + temMaria);

        boolean temJose = nomes.contains("Jose");
        System.out.println("temJose?: " + temJose);

        boolean listaVazia = nomes.isEmpty();
        System.out.println("listaVazia?: " + listaVazia);

        for (String nomeDaLista: nomes) {
            System.out.println("--> " + nomeDaLista);
        }

        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()) {              //o método hasNext() retorna true enquanto ainda tiver elemento na lista
            System.out.println("----> " + iterator.next());
        }

        List<String> segundaListaNomes = new ArrayList<>();
        segundaListaNomes.add("Rafaela");
        segundaListaNomes.add("Isaias");

        System.out.println("segundaListaNomes: " + segundaListaNomes);

        nomes.addAll(0, segundaListaNomes);
        System.out.println("------------Adicionei uma lista na lista nomes: " + nomes);

        nomes.clear();
        System.out.println(nomes);

        listaVazia = nomes.isEmpty();
        System.out.println("listaVazia?: " + listaVazia);


    }
}
