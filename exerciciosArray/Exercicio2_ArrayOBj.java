package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosArray;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.Produto;

import java.util.Scanner;

public class Exercicio2_ArrayOBj {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a quantidade de produtos que deseja inserir:");
        int n = leitor.nextInt();
        Produto[] vetor = new Produto[n];

        for (int i = 0; i < vetor.length; i++) {
            leitor.nextLine();
            System.out.println("Informe o nome do produto: ");
            String nome = leitor.nextLine();
            System.out.println("Informe o preço do produto; ");
            double preco = leitor.nextDouble();
            vetor[i] = new Produto(nome,preco);
        }

        double soma = 0.00;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i].getPreco();
        }

        double media = soma / vetor.length;

        System.out.printf("Preço Médio = %.2f", media);

    }

}
