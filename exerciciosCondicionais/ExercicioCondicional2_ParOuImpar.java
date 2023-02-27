package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosCondicionais;

import java.util.Scanner;

public class ExercicioCondicional2_ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número para verificar se é PAR OU IMPAR: ");
        numero = leitor.nextInt();
        if (numero % 2 == 0) System.out.println("PAR");
        else System.out.println("IMPAR");

    }
}
