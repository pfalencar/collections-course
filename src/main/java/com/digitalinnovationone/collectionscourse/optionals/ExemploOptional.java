package com.digitalinnovationone.collectionscourse.optionals;

import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.empty();
//        Optional<String> stringOptional = Optional.of("Valor opcional");
//        stringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Valor NAO esta presente"));
//
//        System.out.println("isEmpty(): " + stringOptional.isEmpty());
//
//        stringOptional.ifPresent(System.out::println);
//
//        if (stringOptional.isPresent()) {
//            System.out.println("Imprime valor opcional quando ele esta presente. Valor = " + stringOptional.get());
//        }
//
//        stringOptional.map((valor) -> valor.concat("***")).ifPresent(System.out::println);

        //se o optional estiver presente, tudo bem. Senão,ele vai lancar esse excecao.
        System.out.println(stringOptional.orElseThrow(IllegalStateException::new));

    }
}
