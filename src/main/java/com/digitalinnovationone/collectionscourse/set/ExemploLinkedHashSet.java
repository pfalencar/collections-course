package com.digitalinnovationone.collectionscourse.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Garante a ordem que estou inserindo os elementos. Menor performance
public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        Set<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(16);
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);

        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        System.out.println("size = " + sequenciaNumerica.size());

        Iterator iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator = " + iterator.next());
        }

        System.out.println("isEmpty? = " + sequenciaNumerica.isEmpty());
        sequenciaNumerica.clear();
        System.out.println("isEmpty? = " + sequenciaNumerica.isEmpty());
    }
}
