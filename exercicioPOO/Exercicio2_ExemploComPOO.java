package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.Triangulo;

import java.util.Scanner;

public class Exercicio2_ExemploComPOO {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Triangulo X,Y;

        X = new Triangulo();
        Y = new Triangulo();

        System.out.println("Digite os lados do triangulo X: ");
        X.a = leitor.nextDouble();
        X.b = leitor.nextDouble();
        X.c = leitor.nextDouble();

        System.out.println("Digite os lados do triangulo Y: ");
        Y.a = leitor.nextDouble();
        Y.b = leitor.nextDouble();
        Y.c = leitor.nextDouble();


        double areaX = X.area();


        double areaY = Y.area();

        System.out.printf("Area triangulo X: %.4f\n",areaX);
        System.out.printf("Area do triangulo Y: %.4f\n",areaY);

        if (areaX > areaY) System.out.println("AREA MAIOR: X");
        else System.out.println("AREA MAIOR: Y");

    }
}
