package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosBreeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanciaTempo {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int velCarroX = 60;
        int velCarroY = 90;

        int distancia = Integer.parseInt(in.readLine());
        int tempoEmMinutos = (distancia * 60) / (velCarroY - velCarroX);

        System.out.println(tempoEmMinutos + " minutos");
    }


}
