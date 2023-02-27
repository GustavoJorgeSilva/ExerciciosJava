package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosFOR;

import java.util.Scanner;

public class Exercicio3_Media {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        double media;
        double nota1, nota2, nota3;
        for (int i = 0; i < N; i++) {

            nota1 = leitor.nextDouble();
            nota2 = leitor.nextDouble();
            nota3 = leitor.nextDouble();

            media = ((nota1*2) + (nota2*3) + (nota3*5)) / 10;
            System.out.printf("%.1f",media);

        }
    }
}
