package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.Funcionario;

import java.util.Scanner;

public class Exercicio5_Funcionario {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Informe o nome do funcionario: ");
        System.out.print("Nome:");
        funcionario.nome = leitor.nextLine();

        System.out.println("Informe o salario bruto: ");
        System.out.print("Salario Bruto:");
        funcionario.salarioBruto = leitor.nextDouble();

        System.out.println("Informe o imposto a ser cobrado:");
        System.out.print("Imposto:");
        funcionario.taxa = leitor.nextDouble();

        System.out.println(funcionario);

        System.out.println("Informe a porcentagem de aumento de salario: ");
        double porcentagemAumento = leitor.nextDouble();
        funcionario.aumentoSalario(porcentagemAumento);

        System.out.println("Informações atualizadas: ");
        System.out.print(funcionario);

        leitor.close();


    }
}
