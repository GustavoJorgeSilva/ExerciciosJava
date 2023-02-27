package com.udemy.cursojavacompletonelioalves.exercicios.funcoesString;

public class Exercicio2_Split {
    public static void main(String[] args) {

        String s = "Potato apple lemon orange";
        String[] vetor = s.split(" ");



        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(vetor[3]);

    }
}
