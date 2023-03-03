package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosBreeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteDeSelecao1{
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int A, B, C, D;
        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());
        C = Integer.parseInt(in.readLine());
        D = Integer.parseInt(in.readLine());

        if (B > C && D > A && C > 0 && D > 0 && A % 2 == 0) {
            if (C + D > A + B) {
                System.out.println("Valores aceitos");
            }
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
