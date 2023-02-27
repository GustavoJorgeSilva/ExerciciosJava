package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosWhile;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int senha = 2002;
        int senhaDigitada = leitor.nextInt();

        while (senhaDigitada != senha){
            System.out.println("Senha Invalida");
            senhaDigitada = leitor.nextInt();
        }

        System.out.println("Acesso permitido");
    }
}
