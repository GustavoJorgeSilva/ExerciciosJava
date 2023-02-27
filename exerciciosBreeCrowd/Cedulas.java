package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosBreeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cedulas {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;

        int nOriginal = Integer.parseInt(in.readLine());
        int N = nOriginal;
        if (N /100 > 0 ){
            nota100 = N /100;
            N = N % 100;
        } if (N / 50 > 0){
            nota50 = N /50;
            N = N % 50;
        } if (N / 20 > 0){
            nota20 = N / 20;
            N = N %20;
        } if (N / 10 > 0){
            nota10 = N / 10;
            N = N % 10;
        } if (N / 5 > 0) {
            nota5 = N / 5;
            N = N % 5;
        } if (N / 2 > 0){
            nota2 = N / 2;
            N = N % 2;
        }

        nota1 = N;

        System.out.println(nOriginal);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");


    }
}
