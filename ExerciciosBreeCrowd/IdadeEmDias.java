package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosBreeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IdadeEmDias {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int idade, meses, anos, diasDevida, dias;

        diasDevida = Integer.parseInt(in.readLine());

        idade = diasDevida / 365;
        anos = idade;
        meses = (diasDevida % 365) / 30;
        dias = (diasDevida % 365) % 30;

        System.out.println(idade + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}
