package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosFOR;

import java.util.Scanner;

public class Exercicio1_Soma {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite quantos numeros deseja somar:");
        int N = leitor.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Digite um numero:");
            int x = leitor.nextInt();
            soma += x;

        }
        System.out.println("A soma dos números é: " + soma);
    }
}
