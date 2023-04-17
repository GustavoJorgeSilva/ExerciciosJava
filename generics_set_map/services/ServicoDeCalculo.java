package com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map.services;

import java.util.List;

public class ServicoDeCalculo {

    public static<T extends Comparable<T>> T maior(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("A lista nao pode estar vazia");
        }

        T maior = list.get(0);
        for (T item : list) {
            if (item.compareTo(maior) > 0) {
                maior = item;
            }
        }
        return  maior;
    }



}
