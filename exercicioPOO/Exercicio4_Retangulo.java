package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.Retangulo;

import java.util.Scanner;

public class Exercicio4_Retangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a largura do retangulo: ");
        retangulo.largura = leitor.nextDouble();

        System.out.println("Digite a altura do retangulo: ");
        retangulo.altura = leitor.nextDouble();

        double area = retangulo.area();
        double perimetro = retangulo.perimetro();
        double diagonal = retangulo.diagonal();

        System.out.printf("Area = %.2f\n", area);
        System.out.printf("Perimetro = %.2f\n", perimetro);
        System.out.printf("Diagonal = %.2f\n", diagonal);
    }
}
