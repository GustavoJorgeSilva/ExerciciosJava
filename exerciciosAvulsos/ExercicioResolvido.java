package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosAvulsos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int minutos = leitor.nextInt();

        double conta = 50.0;
        if (minutos > 100){
            conta += (minutos - 100) * 2.0; // Esse 100 é equivalente aos minutos disponiveis no "plano", caso
            // fosse um plano diferente esse valor seria outro
            // (minutos - 100) * 2.0 essa formula é pra calcular o excendente de minutos
        }

        System.out.printf("Valor a pagar: R$ %.2f",conta);
    }
}
