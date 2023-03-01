package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio9_AbaixoDaMedia {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = Integer.parseInt(in.readLine());
        double mediaVetor = 0;

        double[] valores = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %do valor ",i+1);
            valores[i] = Double.parseDouble(in.readLine());
        }

        double soma = 0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        mediaVetor = soma / valores.length;

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < n; i++) {
            if(valores[i] < mediaVetor){
                System.out.println(valores[i]);
            }
        }


    }
}
