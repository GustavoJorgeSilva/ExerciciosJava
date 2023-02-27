package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO;

import java.util.Scanner;

public class Exercicio1_ExemploSemPOO {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tamanho dos lados do triangulo X: ");
        double ladoAx = leitor.nextDouble();
        double ladoBx = leitor.nextDouble();
        double ladoCx = leitor.nextDouble();

        System.out.println("Digite o tamanho dos lados do triangulo Y: ");
        double ladoAy = leitor.nextDouble();
        double ladoBy = leitor.nextDouble();
        double ladoCy = leitor.nextDouble();


        double p = (ladoAx + ladoBx + ladoCx) / 2.0;
        double areaX = Math.sqrt(p * (p - ladoAx) * (p - ladoBx) * (p - ladoCx));

        p = (ladoAy + ladoBy + ladoCy) / 2;
        double areaY = Math.sqrt(p * (p - ladoAy) * (p - ladoBy) * (p - ladoCy));

        System.out.printf("Area triangulo X: %.4f\n", areaX);
        System.out.printf("Area trangulo Y: %.4f\n", areaY);

        if (areaX > areaY) System.out.println("Area maior: X");
        else System.out.println("Area maior: Y");

        leitor.close();

    }
}
