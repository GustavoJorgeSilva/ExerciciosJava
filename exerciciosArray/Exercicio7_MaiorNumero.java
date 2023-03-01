package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio7_MaiorNumero {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader( new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        double maiorValor;
        int posicaoMaiorValor;
        double[] valores = new double[n];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite um valor: ");
            valores[i] = Double.parseDouble(in.readLine());
        }

        maiorValor = valores[0];
        posicaoMaiorValor = 0;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > maiorValor){
                maiorValor = valores[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n",maiorValor);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n",posicaoMaiorValor);

    }
}
