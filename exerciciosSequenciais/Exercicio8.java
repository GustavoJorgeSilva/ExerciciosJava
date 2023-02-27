package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosSequenciais;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double largura = leitor.nextDouble();
        double comprimento = leitor.nextDouble();
        double metroQuadrado = leitor.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Area do terreno : %.2f%n", area);
        System.out.printf("Preco do terreno: %.2f%n", preco);



    }
}
