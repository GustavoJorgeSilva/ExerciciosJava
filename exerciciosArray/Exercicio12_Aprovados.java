package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosArray;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.Aluno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio12_Aprovados {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Quantos alunos serao informados: ");
        int n = Integer.parseInt(in.readLine());

        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("DIgite nome, primeira e segunda nota do %do aluno: \n", i + i);
            String nome = in.readLine();
            double primeiraNota = Double.parseDouble(in.readLine());
            double segundaNota = Double.parseDouble(in.readLine());
            alunos[i] = new Aluno(nome, primeiraNota, segundaNota);
        }

        double soma = 0.0;

        for (int i = 0; i < alunos.length; i++) {
            soma += (alunos[i].getNota1Trimestre() + alunos[i].getNota2Trimestre());
        }

        double media = soma / 2;

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < alunos.length; i++) {
            if ((alunos[i].getNota1Trimestre() + alunos[i].nota2Trimestre) / 2 >= 6) {
                System.out.println(alunos[i].getNome());
            }
        }

    }
}
