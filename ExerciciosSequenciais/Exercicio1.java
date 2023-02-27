package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosSequenciais;


import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a, b;
        int soma;

        System.out.println("Digite o primeiro numero: ");
        a = leitor.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = leitor.nextInt();

        soma = a + b;

        System.out.println("SOMA = " + soma);

    }

}

