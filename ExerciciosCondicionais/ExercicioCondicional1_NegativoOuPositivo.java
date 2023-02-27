package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosCondicionais;

import java.util.Scanner;

public class ExercicioCondicional1_NegativoOuPositivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
		
        int numero;

        System.out.println("Digite um número para verificar se ele é negativo ou positivo: ");
        numero = leitor.nextInt();

        if (numero > 0) {
            System.out.println("POSITIVO");
        } else if (numero < 0){
            System.out.println("NEGATIVO");

        } else System.out.println("NAO NEGATIVO");
    }
}
