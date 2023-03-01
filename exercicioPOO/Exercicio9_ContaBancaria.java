package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.ContaBancaria;

import java.util.Scanner;

public class Exercicio9_ContaBancaria {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double valorDepositoInicial = 0;
        ContaBancaria contaBancaria;


        System.out.println("Bem vindo! vamos abrir sua conta :) ");
        System.out.print("Informe o numero da conta: ");
        String numeroConta = leitor.nextLine();

        System.out.print("Informe o nome do titular:");
        String nome = leitor.nextLine();

        System.out.println();
        System.out.println("Deseja fazer um deposito inicial? (s/n)");
        char depositoInicial = leitor.nextLine().charAt(0);
        if (depositoInicial == 's'){
            System.out.println("informe o valor do deposito:");
            valorDepositoInicial = leitor.nextDouble();
            contaBancaria = new ContaBancaria(numeroConta,nome,valorDepositoInicial);
        } else {
            contaBancaria = new ContaBancaria(numeroConta,nome);
        }



        System.out.println("Parabens pela abertura da conta!!!");
        System.out.println("Dados da conta:");
        System.out.println(contaBancaria);

        System.out.println("Vamos fazer um deposito");
        System.out.print("Informe o valor:");
        double deposito = leitor.nextDouble();
        contaBancaria.deposito(deposito);

        System.out.println("Dados atualizados:");
        System.out.println(contaBancaria);

        System.out.println("Vamos fazer um saque: * O saque tem uma taxa de R$ 5,00");
        System.out.print("Informe o valor:");
        double saque = leitor.nextDouble();
        contaBancaria.saque(saque);

        System.out.println("Dados atualizados:");
        System.out.println(contaBancaria);

        System.out.println(contaBancaria.verificarSaldo());

        leitor.close();







    }
}
