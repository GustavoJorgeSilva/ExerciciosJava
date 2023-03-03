package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosAvulsos;

public class LacoForEach {
    public static void main(String[] args) {


        String[] vetor = new String[]{"Maria", "Pedro", "alex"};

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("--------------------------------------------");
        for (String obj : vetor){
            System.out.println(obj);
        }


    }
}
