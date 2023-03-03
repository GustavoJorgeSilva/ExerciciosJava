package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosArray;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.AluguelQuarto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio14_Pensionato {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Quantos estudantes vao se hospedar? ");
        int n = Integer.parseInt(in.readLine());
        int numeroQuarto;
        String email;
        String nome;

        AluguelQuarto[] quartos = new AluguelQuarto[10];

        for (int i = 0; i < n; i++) {
            System.out.printf("Locador #%d\n",i+1);
            System.out.print("Nome: ");
            nome = in.readLine();
            System.out.print("Email: ");
            email = in.readLine();
            System.out.print("Quarto: ");
            numeroQuarto = Integer.parseInt(in.readLine());

            if (quartos[numeroQuarto - 1] == null){
                quartos[numeroQuarto -1] = new AluguelQuarto(numeroQuarto,nome,email);
            } else {
                while (quartos[numeroQuarto -1 ] != null){
                    System.out.println("Quarto nao disponivel");
                    System.out.print("Por favor escolha outro quarto:");
                    numeroQuarto = Integer.parseInt(in.readLine());
                }
                quartos[numeroQuarto -1] = new AluguelQuarto(numeroQuarto,nome,email);
            }
        }

        boolean pensionatoCheio = true;
        for (int i = 0; i < quartos.length; i++) {
            if(quartos[i] != null){
                System.out.println(quartos[i]);
            } else {
                pensionatoCheio = false;
            }

        }
        if (!pensionatoCheio){
            System.out.println("Ainda há quartos disponiveis!");
        } if (pensionatoCheio){
            System.out.println("Todos os quartos estao ocupados!");
        }
    }
}