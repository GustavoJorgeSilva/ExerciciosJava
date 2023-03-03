package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio10_MediaPares {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int somaDosPares = 0;
        double mediaDosPares = 0;
        int pares = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = Integer.parseInt(in.readLine());

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %do valor: ",i+1);
            vetor[i] = Integer.parseInt(in.readLine());
        }


        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] %2 == 0){
                somaDosPares += vetor[i];
                pares++;
            }
        }



        if (pares > 0){
            mediaDosPares = somaDosPares / pares;
            System.out.printf("HAHA DOS PARES = %.2f",mediaDosPares);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }


    }
}
