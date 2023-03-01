package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio6_Pares {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n, qntdNumerosPares = 0;

        System.out.println("Quantos numeros voce vai digitar?");
        n = Integer.parseInt(in.readLine());

        int[] vetor = new int[n];
        int[] pares = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = Integer.parseInt(in.readLine());
        }

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                pares[i] = vetor[i];
                qntdNumerosPares++;
            }
        }

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < n; i++) {
            System.out.print(pares[i]+" ");
        }

        System.out.println();
        System.out.println("QUANTIDADE DE NUMEROS PARES = " + qntdNumerosPares);
    }
}
