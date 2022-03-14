package com.digitalinnovationone.collectionscourse.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class ExemploLinkedList {

    public static void main(String[] args) throws ListaVaziaException {

        Queue<String> filaDeBanco = new LinkedList<>();
        filaDeBanco.add("Cliente1");
        filaDeBanco.add("Cliente2");
        filaDeBanco.add("Cliente3");
        filaDeBanco.add("Cliente4");

        System.out.println(filaDeBanco);

        String e = filaDeBanco.element();

        System.out.println(e);

        System.out.println(filaDeBanco);

        String removido = filaDeBanco.remove();
        System.out.println("removido: " + removido);
        System.out.println(filaDeBanco);

        filaDeBanco.offer("Cliente5");
        System.out.println(filaDeBanco);

        filaDeBanco.add("Cliente6");
        System.out.println(filaDeBanco);

        String pool1 = filaDeBanco.poll();  //tira o primeiro que entrou na fila
        System.out.println("poll1: " + pool1);
        System.out.println(filaDeBanco);

        Iterator<String> iteratorFilaBanco = filaDeBanco.iterator();
        while (iteratorFilaBanco.hasNext()) {
            System.out.println("---> " + iteratorFilaBanco.next());
        }

        System.out.println("Tamanho da fila: " + filaDeBanco.size());

        filaDeBanco.add("Mara");
        System.out.println("----> Mara: " + filaDeBanco);

        System.out.println("Fila vazia?: " + filaDeBanco.isEmpty());
        filaDeBanco.clear();
        System.out.println("Fila vazia?: " + filaDeBanco.isEmpty());

        System.out.println(filaDeBanco);

        String peek1 = filaDeBanco.peek(); //só visualiza o primeiro que entrou na lista e se a fila estiver vazia, retorna null
        System.out.println("peek: " + peek1);

        System.out.println(filaDeBanco);

        try{
            String primeiroClienteOuErro = filaDeBanco.element(); //tb só visualiza o primeiro elemento, mas se a fila estiver vazia, retorna um erro.
            System.out.println("primeiro Cliente Ou Erro: " + primeiroClienteOuErro);
        } catch (NoSuchElementException exc) {
            throw new ListaVaziaException ("Erro: "+ exc);
        } finally {
            Queue<String> filaDeBanco2 = new LinkedBlockingQueue<>(3);
            filaDeBanco2.offer("Gerente1");
            filaDeBanco2.offer("Gerente2");
            filaDeBanco2.offer("Gerente3");
            filaDeBanco2.offer("Gerente4");

            System.out.println(filaDeBanco2);

        }
//        System.out.println("****** Depois do finally....");
    }
}
