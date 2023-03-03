package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio13_DadosPessoas {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n, numeroDeHomens, numeroDeMulheres;
        double maiorAltura, menorAltura, mediaAlturaHomens, mediaAlturaMulheres;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = Integer.parseInt(in.readLine());

        Character[] genero = new Character[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            alturas[i] = Double.parseDouble(in.readLine());

            System.out.printf("Genero da %da pessoa: ", i + 1);
            String linha = in.readLine();
            genero[i] = linha.charAt(0);
        }

        maiorAltura = 0.0;
        menorAltura = 0.0;

        for (int i = 0; i < n; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (i == 0 || alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }

        System.out.printf("Maior altura: %.2f\n", maiorAltura);
        System.out.printf("Menor Altura: %.2f\n", menorAltura);

        mediaAlturaHomens = 0.00;
        mediaAlturaMulheres = 0.00;
        numeroDeHomens = 0;
        numeroDeMulheres = 0;

        for (int i = 0; i < n; i++) {
            if (Character.toLowerCase(genero[i]) == 'm') {
                mediaAlturaHomens += alturas[i];
                numeroDeHomens++;
            } else if (Character.toLowerCase(genero[i]) == 'f') {
                mediaAlturaMulheres += alturas[i];
                numeroDeMulheres++;
            }
        }

        if (numeroDeHomens > 0) {
            mediaAlturaHomens /= numeroDeHomens;
            System.out.printf("Media da altura de homens: %.2f\n", mediaAlturaHomens);
        } else {
            System.out.println("Nenhum homem foi registrado");
        }

        if (numeroDeMulheres > 0) {
            mediaAlturaMulheres /= numeroDeMulheres;
            System.out.printf("Media da altura de mulheres: %.2f\n", mediaAlturaMulheres);
        } else {
            System.out.println("Nenhuma mulher foi registrada");
        }


        System.out.println("NUMERO DE HOMENS = " + numeroDeHomens);
        System.out.println("NUMERO DE MULHERES =" + numeroDeMulheres);
    }
}
