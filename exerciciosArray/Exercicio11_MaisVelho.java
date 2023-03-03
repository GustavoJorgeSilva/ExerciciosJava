package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio11_MaisVelho {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        double maiorValor;
        int posicaoMaiorValor;
        int n = Integer.parseInt(in.readLine());

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: \n", i+1);
            System.out.print("Nome: ");
            nomes[i] = in.readLine();
            System.out.print("Idade: ");
            idades[i] = Integer.parseInt(in.readLine());
        }

        maiorValor = idades[0];
        posicaoMaiorValor = 0;

        for (int i = 0; i < n; i++) {
            if(idades[i] > maiorValor){
                maiorValor = idades[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: "+ nomes[posicaoMaiorValor]);




    }
}
