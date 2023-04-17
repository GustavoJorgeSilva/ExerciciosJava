package com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map.services;

import java.util.ArrayList;
import java.util.List;

public class ServicoDeImpressao<T>{

    private List<T> numeros = new ArrayList<>();
    public void adicionarValor(T valor){
            numeros.add(valor);
    }

    public T primeiro(){
       if (numeros.isEmpty()){
           throw new IllegalStateException("A lista esta vazia");
       }
        return numeros.get(0);
    }

    public void imprimir(){
        System.out.print("[");
        if (!numeros.isEmpty()){
            System.out.print(numeros.get(0));
        }
        for (int i = 1; i < numeros.size(); i++) {
            System.out.print(", " + numeros.get(i));
        }
        System.out.print("]\n");
    }


}
