package com.digitalinnovationone.collectionscourse.queue;

public class ListaVaziaException extends Throwable {
    public ListaVaziaException(String s) {
        System.out.println("Nao se pode remover elemento de uma lista vazia. ==> " + s);
    }
}
