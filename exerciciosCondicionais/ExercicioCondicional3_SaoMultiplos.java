package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosCondicionais;

import java.util.Scanner;

public class ExercicioCondicional3_SaoMultiplos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double numero1, numero2;

        System.out.println("Digite dois numeros e descubra se são multiplos: ");
        numero1 = leitor.nextDouble();
        numero2 = leitor.nextDouble();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) System.out.println("São multiplos");
        else System.out.println("NAO SAO MULTIPLOS");
    }
}
