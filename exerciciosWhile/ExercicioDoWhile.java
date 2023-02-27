package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosWhile;

import java.util.Scanner;

public class ExercicioDoWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char resposta;

        do{
            System.out.print("Digite a temperatura em celcius: ");
            double grausC = leitor.nextDouble();

            double fahreinheit = 9.0 * grausC / 5.0 + 32;
            System.out.printf("O equivalente em fahreinheit é: %.1f\n ", fahreinheit);
            System.out.println("Deseja repetir? s/n");
            resposta = leitor.next().charAt(0);
        } while (resposta != 'n');

        leitor.close();

    }
}
