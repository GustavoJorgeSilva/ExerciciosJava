package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.util;

public class ConversorDeMoeda {

    public static double conversao(double cotacao, double qntdASerComprado) {
        return cotacao * qntdASerComprado;
    }

    public static double iof(double totalReais) {
        return totalReais * 0.06;
    }
}
