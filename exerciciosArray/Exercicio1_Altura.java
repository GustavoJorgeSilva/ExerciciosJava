package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosArray;

import java.util.Scanner;

public class Exercicio1_Altura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.print("Quantidade de verificação: ");
        int n = leitor.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Informe a altura:");
            vetor[i] = leitor.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }
        double media = soma / n;

        System.out.printf("Media das alturas = %.2f", media);
    }
}
