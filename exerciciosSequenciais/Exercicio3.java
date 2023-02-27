package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosSequenciais;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a, b, c, d, diferenca;


        System.out.println("Digite 4 numeros:");
        a = leitor.nextInt();
        b = leitor.nextInt();
        c = leitor.nextInt();
        d = leitor.nextInt();
        diferenca = a * b - c * d;
        System.out.println("DIFERENÇA = " + diferenca);


    }
}
