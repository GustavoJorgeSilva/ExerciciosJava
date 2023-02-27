package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosFOR;

import java.util.Scanner;

public class Exercicio4_Divisao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        double numero1, numero2,divisao;

        for (int i = 0; i < N; i++) {
            numero1 = leitor.nextDouble();
            numero2 = leitor.nextDouble();
            if ( numero2 == 0){
                System.out.println("Divisão impossivel");
            } else{
                divisao = numero1 / numero2;
                System.out.println(divisao);
            }
        }
    }
}
