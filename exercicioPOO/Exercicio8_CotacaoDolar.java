package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.util.ConversorDeMoeda;

import java.util.Scanner;

public class Exercicio8_CotacaoDolar {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a cotação atual do Dolar: ");
        double cotacaoDolar = leitor.nextDouble();
        System.out.print("Informe quantos dolares deseja comprar:");
        double qntdDolar = leitor.nextDouble();
        System.out.println();

        double totalConversao = ConversorDeMoeda.conversao(cotacaoDolar, qntdDolar);
        double iof = ConversorDeMoeda.iof(totalConversao);
        double valorTotalCompra = totalConversao + iof;

        System.out.printf("O valor a ser pago em reais é: %.2f", valorTotalCompra);

    }
}
