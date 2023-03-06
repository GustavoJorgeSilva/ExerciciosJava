package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosMatriz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio1_Matriz {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int [][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            System.out.printf("Coluna: #%d\n", i + 1);
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Digite um numero: ");
                mat[i][j] = Integer.parseInt(in.readLine());
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        int numerosNegativos = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
               if( mat[i][j] < 0){
                   numerosNegativos++;
               }
            }
        }
        System.out.println();
        System.out.println("Numeros negativos = " +numerosNegativos);
    }
}
