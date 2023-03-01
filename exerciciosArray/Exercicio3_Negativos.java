package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosArray;

import java.util.Scanner;

public class Exercicio3_Negativos {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero de 1-10: ");
        int n = leitor.nextInt();

        if (n >10 || n < 0){
            System.out.println("Valor invalido, digite um numero de 1-10");
            n = leitor.nextInt();
        }

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            leitor.nextLine();
            System.out.print("Digite um numero: ");
            vetor[i] = leitor.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }


    }
}
