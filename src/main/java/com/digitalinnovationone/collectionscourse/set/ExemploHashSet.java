package com.digitalinnovationone.collectionscourse.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Não garante a ordem que você insere. Tem alta performance.
public class ExemploHashSet {

    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        notasAlunos.remove(5.4);
        System.out.println(notasAlunos);

        System.out.println("size = " + notasAlunos.size());

        Iterator iterator = notasAlunos.iterator();
        while(iterator.hasNext()) {
            System.out.println("---> iterator = " + iterator.next());
        }

        HashSet<Double> iteratorAuxiliar = new HashSet<>();
        iteratorAuxiliar.addAll(notasAlunos);
        System.out.println("---> Segunda Lista = " + iteratorAuxiliar);

        notasAlunos.removeAll(notasAlunos);
        System.out.println(notasAlunos);
        System.out.println("isEmpty? = " + notasAlunos.isEmpty());

        iteratorAuxiliar.clear();
        System.out.println("---> Segunda Lista = " + iteratorAuxiliar);


    }
}
