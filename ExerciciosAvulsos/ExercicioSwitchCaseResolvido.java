package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosAvulsos;

import java.util.Scanner;

public class ExercicioSwitchCaseResolvido {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite o dia da semana:");
        int numeroDia = leitor.nextInt();
        String dia;
        switch(numeroDia){

            case 1:
                dia = "Domingo";
                break;

            case 2:
                dia = "Segunda";
                break;

            case 3:
                dia = "Terça";
                break;

            case 4:
                dia = "Quarta";
                break;

            case 5:
                dia = "Quinta";
                break;

            case 6:
                dia = "Sexta";
                break;

            case 7:
                dia = "Sabado";
                break;

            default: dia = "VALOR INVALIDO";
                break;

        }
        System.out.println(dia);

    }
}
