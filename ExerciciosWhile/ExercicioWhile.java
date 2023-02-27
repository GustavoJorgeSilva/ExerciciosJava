package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosWhile;

import java.util.Scanner;

public class ExercicioWhile {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
            x = leitor.nextInt();

        }

        System.out.println(soma);
    }
}
