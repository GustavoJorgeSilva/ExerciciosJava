package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosAvulsos;

import java.util.Scanner;

public class ExercicioTestandoBitWise {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int mask = 32; // ou 0b00100000 em binario
        int n = leitor.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is true");
        } else System.out.println("6th bit is false");;
    }
}
