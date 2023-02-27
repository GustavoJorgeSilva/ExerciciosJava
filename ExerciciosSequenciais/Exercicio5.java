package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosSequenciais;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int peca1, peca2, qtdPeca1, qtdPeca2;
        double valorPeca1, valorPeca2, totalAPagar;

        System.out.println("Digite na sequencia o código da peca, a quantidade e o valor unt da peça: ");
        peca1 = leitor.nextInt();
        qtdPeca1 = leitor.nextInt();
        valorPeca1 = leitor.nextDouble();


        System.out.println("Digite agora na mesma sequencia outra peça: ");
        peca2 = leitor.nextInt();
        qtdPeca2 = leitor.nextInt();
        valorPeca2 = leitor.nextDouble();


        totalAPagar = valorPeca1 * qtdPeca1 + valorPeca2 * qtdPeca2;

        System.out.printf("VALOR A PAGAR = %.2f", totalAPagar);


    }
}
