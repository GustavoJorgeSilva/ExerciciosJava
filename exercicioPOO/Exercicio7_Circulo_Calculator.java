package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO;


import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.util.Calculator;
import java.util.Scanner;


public class Exercicio7_Circulo_Calculator {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        System.out.print("Informe o raio: ");
        double raio = leitor.nextDouble();

        double C = Calculator.circunferencia(raio);

        double V = Calculator.volume(raio);

        System.out.printf("Circunferencia: %.2f\n", C);
        System.out.printf("Volume: %.2f\n", V);
        System.out.printf("Valor do pi: %.2f\n", Calculator.PI);


    }


}
