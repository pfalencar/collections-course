package com.digitalinnovationone.collectionscourse.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExemploList {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("Joao", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        //Ordem de insercao
        System.out.println("------ Ordem de insercao -------");
        System.out.println(estudantes);
        System.out.println();

        System.out.println(" --- ordem natural dos numeros - idade (lambda) ---");
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);
        System.out.println();

        System.out.println(" --- ordem reversa dos numeros - idade (lambda) ---");
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println(estudantes);
        System.out.println();

        System.out.println(" --- ordem natural dos numeros - idade (referencia de metodo ::) ---");
        //uma logica de comparator em tempo de execucao
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);
        System.out.println();

        System.out.println(" --- ordem reversa dos numeros - idade (referencia de metodo ::) ---");
        //uma logica de comparator em tempo de execucao
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes);
        System.out.println();

        System.out.println(" --- ordem natural dos numeros - idade (Lista tem que implementar a interface Comparable) ---");
        Collections.sort(estudantes);
        System.out.println(estudantes);
        System.out.println();

        System.out.println(" --- ordem reversa dos numeros - idade \n(Lista NAO precisa implementar a interface Comparable, \nmas envia uma classe que faz isso: EstudanteOrdemIdadeReversaComparator) ---");
        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
        System.out.println(estudantes);

    }
}
