package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosFOR;

import java.util.Scanner;

public class Exercicio6_Divisores {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        int div;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 ){
                div = i;
                System.out.println(div);
            }
        }
    }
}

