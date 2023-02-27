package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosSequenciais;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;


        System.out.println("Digite 3 valores: ");
        System.out.println("VALOR A:");
        a = leitor.nextDouble();
        System.out.println("VALOR B: ");
        b = leitor.nextDouble();
        System.out.println("VALOR C: ");
        c = leitor.nextDouble();

        triangulo = (a * c) / 2; // Área de um triângulo = (base x altura) / 2 foi considerado base A e altura C
        circulo = 3.14159 * (c * c); // Área da circunferência = pi x raio x raio foi considerado C como raio
        trapezio = (a + b) * c / 2;//Área de um trapézio = (base maior + base menor) x altura / 2 A e B bases e C altura
        quadrado = b * b; // Área de um quadrado = lado x lado foi considerado B como lado
        retangulo = a * b; // Área de um retângulo = base x altura foi considerado LADOS A e B

        System.out.printf("TRIANGULO %.3f%n", triangulo);
        System.out.printf("CIRCULO %.3f%n", circulo);
        System.out.printf("TRAPEZIO %.3f%n", trapezio);
        System.out.printf("QUADRADO %.3f%n", quadrado);
        System.out.printf("RETANGULO %.3f%n", retangulo);


    }
}
