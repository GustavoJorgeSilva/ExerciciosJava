package com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map;

import com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map.services.ServicoDeImpressao;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        try {
            ServicoDeImpressao<Integer> servicoDeImpressao = new ServicoDeImpressao<>();
            Scanner leitor = new Scanner(System.in);

            System.out.println("Quantos valores?");
            int n = leitor.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Informe o numero: ");
                int numeroDigitado = leitor.nextInt();
                servicoDeImpressao.adicionarValor(numeroDigitado);
            }


            servicoDeImpressao.imprimir();
            System.out.println("Primeiro numero digitado: " + servicoDeImpressao.primeiro());

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
