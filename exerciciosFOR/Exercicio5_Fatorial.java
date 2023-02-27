package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosFOR;

import java.util.Scanner;

public class Exercicio5_Fatorial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        int fat;
        for (fat = 1; n > 1; n = n - 1) {
            fat = fat * n;

        }
        System.out.println(fat);
    }
}
