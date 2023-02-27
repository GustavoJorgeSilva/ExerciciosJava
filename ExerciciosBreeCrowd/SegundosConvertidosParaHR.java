package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosBreeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SegundosConvertidosParaHR {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int horas,minutos,segundos;
        int N = Integer.parseInt(in.readLine());


        horas = N / 3600;
        minutos = (N % 3600) / 60;
        segundos = (N % 3600) % 60;

        System.out.println(horas+":"+minutos+":"+segundos);


    }
}
