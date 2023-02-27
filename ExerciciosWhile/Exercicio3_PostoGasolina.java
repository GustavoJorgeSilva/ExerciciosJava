package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosWhile;


import java.util.Scanner;

public class Exercicio3_PostoGasolina {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        int codigoCombustivel = leitor.nextInt();

        while (codigoCombustivel != 4) {

            if (codigoCombustivel == 1) {
                alcool++;
            }
            else if (codigoCombustivel == 2) {
                gasolina++;
            }
            else if (codigoCombustivel == 3) {
                diesel++;
            } else {
                System.out.println("Código invalido, tente novamente:");
            }
            codigoCombustivel = leitor.nextInt();

        }

        System.out.println("Muito Obrigado");
        System.out.println("Alcool:" + alcool);
        System.out.println("Gasolina:" + gasolina);
        System.out.println("Diesel:" + diesel);


    }
}
