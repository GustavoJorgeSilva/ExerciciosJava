package com.udemy.cursojavacompletonelioalves.exercicios.exericiosTryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws IOException {

        method1();

        System.out.println("Fim do programa!");


    }

    public static void method1() throws IOException {
        System.out.println("------INICIO METODO 1------");
        method2();
        System.out.println("------FIM METODO 1------");

    }

    public static void method2() throws IOException {
        System.out.println("------INICIO METODO 2------");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner leitor = new Scanner(System.in);

        try {
            String[] vetor = in.readLine().split(" ");
            int position = leitor.nextInt();
            System.out.println(vetor[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicao invalida!");
            e.printStackTrace();

        } catch (InputMismatchException e) {
            System.out.println("Erro de input!");
        }


        leitor.close();
        System.out.println("------FIM METODO 2------");
    }
}
