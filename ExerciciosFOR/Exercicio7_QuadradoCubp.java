package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosFOR;

import java.util.Scanner;

public class Exercicio7_QuadradoCubp {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        int linha = 0;
        double cubo, quadrado;
        for (int i = 0; i < n; i++) {
            linha++;
            quadrado = (linha * linha);
            cubo = Math.pow(linha, 3);

            System.out.println(linha + " " + (int) quadrado + " " + (int) cubo);
        }
    }
}
