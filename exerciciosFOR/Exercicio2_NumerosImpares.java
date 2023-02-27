package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosFOR;

import java.util.Scanner;

public class Exercicio2_NumerosImpares {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int X = leitor.nextInt();
        int numerosImpares = 0;

        for (int i = 0; i <= X; i++) {
            if (i % 2 != 0) {
                numerosImpares=i;
                System.out.println(numerosImpares);
            }

        }
    }
}
