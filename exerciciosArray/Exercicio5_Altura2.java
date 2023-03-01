package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosArray;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exercicio5_Altura2 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n, nmenores;
        double alturatotal, alturamedia, percentualMenores;

        n = Integer.parseInt(in.readLine());

        String[] nomes = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n ",i+1);
            System.out.print("Nome: ");
            nomes[i] = in.readLine();
            System.out.print("Idade: ");
            idade[i] = Integer.parseInt(in.readLine());
            System.out.print("Altura: ");
            altura[i] = Double.parseDouble(in.readLine());

        }

        nmenores = 0;
        alturatotal = 0;

        for (int i = 0; i < n; i++) {
            if(idade[i] < 16){
                nmenores++;
            }
            alturatotal += altura[i];
        }

        alturamedia = alturatotal / n;
        percentualMenores = ((double) nmenores / n) *100;

        System.out.printf("\nAltura media = %.2f\n", alturamedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);


        for (int i = 0; i < n; i++) {
            if(idade[i] < 16){
                System.out.println(nomes[i]);
            }
        }


    }

}