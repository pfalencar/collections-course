package com.digitalinnovationone.collectionscourse.set;

import java.util.Iterator;
import java.util.TreeSet;


//Arvore binaria => A ordenacao eh feita por um algoritmo de ordenacao do TreeSet,
// o qual tem o foco de montar uma árvore com nós e os nós filhos
//Assim, a ordem codada nao eh mantida (confira o print da lista).
//Permite ordenacao por meio de comparator
//Leitura é performatica, mas add eh lento
public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Manaus");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Teresina");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        boolean temSaoPaulo = treeCapitais.contains("Sao Paulo");
        System.out.println("temSP = " + temSaoPaulo);

        //Retorna a primeira cidade no topo da arvore
        String first = treeCapitais.first();
        System.out.println("first = " + first);
        System.out.println(treeCapitais);

        //Retorna a ultima cidade no final da arvore
        System.out.println("last = " + treeCapitais.last());
        System.out.println(treeCapitais);

        //Retorna a primeira cidade abaixo da arvore da cidade parametrizada
        String lower = treeCapitais.lower("Porto Alegre");
        System.out.println("lower = " + lower);
        System.out.println(treeCapitais);

        //Retorna a primeira cidade acima da arvore da cidade parametrizada
        System.out.println("higher = " + treeCapitais.higher("Teresina"));

        //Retorna e remove o primeiro elemento da lista
        System.out.println("pollFirst = " + treeCapitais.pollFirst());
        System.out.println(treeCapitais);

        //Retorna e remove o ultimo elemento da lista
        System.out.println("pollLast = " + treeCapitais.pollLast());
        System.out.println(treeCapitais);

        Iterator iterator = treeCapitais.iterator();
        while (iterator.hasNext()) {
            System.out.println("---> iterator = " + iterator.next());
        }
    }
}
