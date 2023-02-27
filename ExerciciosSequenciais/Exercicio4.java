package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosSequenciais;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int identificacaoFuncionario;
        double horasTrabalhadas, valorHora, salario;

        System.out.println("Digite o código de identificação do" +
                " funcionario: ");
        identificacaoFuncionario = leitor.nextInt();
        System.out.println("Digite a quantidade de hrs trabalhadas: ");
        horasTrabalhadas = leitor.nextDouble();
        System.out.println("Digite o valor hr que recebe: ");
        valorHora = leitor.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.println("IDENTIFICAÇÂO: "+ identificacaoFuncionario);
        System.out.printf("SALARIO: U$ %.2f", salario);
    }
}
