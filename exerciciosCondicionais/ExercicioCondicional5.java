package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosCondicionais;

import java.util.Scanner;

public class ExercicioCondicional5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        int codigo, quantidade;
        System.out.println("Digite o código do produto: ");
        codigo = leitor.nextInt();
        System.out.println("Digite a quantidade: ");
        quantidade = leitor.nextInt();

        double total;
        if (codigo == 1) {
            total = quantidade * 4.00;
        } else if (codigo == 2) {
            total = quantidade * 4.5;
        } else if (codigo == 3) {
            total = quantidade * 5.0;
        } else if (codigo == 4) {
            total = quantidade * 2.0;
        } else {
            total = quantidade * 1.50;
        }

        leitor.close();

        System.out.printf("VALOR TOTAL = %.2f R$",total);
    }
}
