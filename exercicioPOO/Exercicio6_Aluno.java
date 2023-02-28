package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.Aluno;

import java.util.Scanner;

public class Exercicio6_Aluno {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        aluno.nome = leitor.nextLine();

        System.out.println("Informe as notas dos 3 trimestres: ");
        aluno.nota1Trimestre = leitor.nextDouble();
        aluno.nota2Trimestre = leitor.nextDouble();
        aluno.nota3Trimestre = leitor.nextDouble();

        System.out.printf("NOTA FINAL = "+aluno.notaFinal());
        System.out.println(aluno.verificarNotaFinal(aluno.notaFinal()));
    }
}
