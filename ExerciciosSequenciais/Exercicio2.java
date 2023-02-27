package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosSequenciais;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double raio, area;

        System.out.println("Digite o raio do circulo: ");
        raio = leitor.nextDouble();
        area = 3.14159 * raio * raio;
        System.out.printf("A area do circulo é: %.4f", area);


    }
}
