package com.digitalinnovationone.collectionscourse.optionals;

import java.util.Optional;

public class ExemploOptionalEstados {

    public static void main(String[] args) {

        //Optional tem o tipo generico <String> e para tipos primitivos
        //metodo "of" recebe um valor de dado do tipo que a gente esta trabalhando, neste caso: String
        Optional<String> stringOptional = Optional.of("Valor Presente");
        //ao criar o Optional com o metodo "of" temos certeza que existe um valor != null ali.
        System.out.println("---- 1 - Valor opcional que esta presente ----");
        //o metodo recebe 2 argumentos: se o valor estiver presente executa o primeiro, senao, executa o segundo
        //o primeiro parametro passa o valor de stringOptional (que recebeu em Optional.of() na declaracao) e retorna ele.
        //Mas se ele for nulo, executa o que esta no segundo parametro.
        //a linha tambem pode ser escrita desta forma (eh o mesmo):
        //stringOptional.ifPresentOrElse((valor) -> System.out.println(valor) , () -> System.out.println("nao esta presente"));
        stringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("nao esta presente"));


        System.out.println("\n---- 2 - Valor opcional que NAO esta presente ----");
        //Usar "ofNullable" quando o valor pode ser que venha nulo, para nao tomar NullPointerException
        Optional<String> optionalNull = Optional.ofNullable(null);
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = nao esta presente"));


        System.out.println("\n---- 3 - Valor opcional que NAO esta presente ----");
        //Qdo queremos construir um optional com um valor inicial: empty,
        // ou uma necessidade de negocio na qual esse Optional vai ser vazio
        //o metodo acima: "ofNullable", se for nulo, vai chamar o "empty()". Ver implementacao do "ofNullable"
        Optional<String> emptyOptional = Optional.empty();
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = nao esta prsente"));


        System.out.println("\n---- 4 - Valor opcional que lanca erro de NullPointerException ----");
        //metodo "of" passando null, recebe NullPointerException
        Optional<String> optionalNullErro = Optional.of(null);
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = nao esta presente"));

    }
}
