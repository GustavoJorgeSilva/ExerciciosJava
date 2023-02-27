package com.udemy.cursojavacompletonelioalves.exercicios.funcoesSintaxe;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite 3 números: ");
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        int maior = max(a,b,c);
        showResult(maior);
    }


    public static int max(int x, int y, int z){
        int aux;
        if (x > y && x > z) aux = x;

        else if (y > z) aux = y;

         else aux = z;

        return aux;
    }

    public static void showResult(int value){
        System.out.println("Maior = "+ value);
    }
}
