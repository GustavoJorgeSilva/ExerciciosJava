package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosWhile;

import java.util.Scanner;

public class Exercicio2_PlanoCartesiano {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        int x = leitor.nextInt();
        int y = leitor.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("Primeiro");
            }
            else if (x < 0 && y > 0){
                System.out.println("Segundo");
            }
            else if(x <0 && y < 0){
                System.out.println("Terceiro");
            }
            else System.out.println("Quarto");

            x = leitor.nextInt();
            y = leitor.nextInt();
        }
    }
}
