package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosBreeCrowd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalcularDIstanciaEntreDoisPontos {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String[] plano1 = in.readLine().split(" ");
        double x1 = Double.parseDouble(plano1[0]);
        double y1 = Double.parseDouble(plano1[1]);

        String[] plano2 = in.readLine().split(" ");
        double x2 = Double.parseDouble(plano2[0]);
        double y2 = Double.parseDouble(plano2[1]);

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("%.4f\n", distancia);

    }
}
