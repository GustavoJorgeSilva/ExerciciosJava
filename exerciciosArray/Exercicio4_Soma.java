package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosArray;

import java.util.Scanner;

public class Exercicio4_Soma {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        System.out.print("Digite um numero de 1-10: ");
        int n = leitor.nextInt();

        double[] vetor = new double[n];


        for (int i = 0; i < vetor.length; i++) {
            leitor.nextLine();
            System.out.print("Digite um numero: ");
            vetor[i] = leitor.nextDouble();
        }

        double soma = 0.00;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        System.out.print("VALORES = " );
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
        System.out.println("SOMA = " + soma);

        double media = soma / vetor.length;

        System.out.println("MEDIA = " + media);
    }
}
