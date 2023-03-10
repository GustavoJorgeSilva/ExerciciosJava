package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio1_List {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());

        for (String nomes : list) {
            System.out.println(nomes);
        }

        System.out.println("------------------------------------------");
        list.removeIf(x -> x.charAt(0) == 'M'); // Predicated
        for (String nomes : list) {
            System.out.println(nomes);
        }

        System.out.println("------------------------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("------------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("------------------------------------------");
        String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome);
        System.out.println("------------------------------------------");
        String nome1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nome1);
    }
}
