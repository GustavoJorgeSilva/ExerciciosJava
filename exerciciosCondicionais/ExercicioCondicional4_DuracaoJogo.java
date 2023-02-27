package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosCondicionais;

import java.util.Scanner;

public class ExercicioCondicional4_DuracaoJogo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double inicioJogo, finalJogo;
        double duracaoTotal;
        System.out.println("Digite a hora inicial do jogo: ");
        inicioJogo = leitor.nextDouble();
        System.out.println("Digite a hora final do jogo: ");
        finalJogo = leitor.nextDouble();



        if (inicioJogo < finalJogo) duracaoTotal = finalJogo - inicioJogo;
        else  {
            duracaoTotal = (24 - inicioJogo) + finalJogo;
        }

        System.out.println("O JOGO DUROU "+duracaoTotal+" HORAS");

        leitor.close();



    }
}
