package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio8_SomaVetores {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Quantos valores vai ter cada vetor?");
        int n = Integer.parseInt(in.readLine());

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            System.out.printf("valor %d:  ", i+1);
            vetorA[i] = Integer.parseInt(in.readLine());
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Valor %d:  ", i+1);
            vetorB[i] = Integer.parseInt(in.readLine());
        }

        for (int i = 0; i < n; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vetorC[i]);
        }



    }
}
