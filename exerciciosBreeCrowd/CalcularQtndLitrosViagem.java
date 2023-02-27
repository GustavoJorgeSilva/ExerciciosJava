package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosBreeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcularQtndLitrosViagem {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int tempoViagem, velocidadeMedia;
        int autonomiaCarro = 12;

        tempoViagem = Integer.parseInt(in.readLine());
        velocidadeMedia = Integer.parseInt(in.readLine());

        double distancia = velocidadeMedia * tempoViagem;
        double qntDeLitros = distancia / autonomiaCarro;

        System.out.printf("%.3f\n",qntDeLitros);

    }
}
