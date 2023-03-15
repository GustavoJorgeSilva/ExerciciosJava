package com.udemy.cursojavacompletonelioalves.exercicios.exercicioContribuintes;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioContribuintes.entidades.Contribuinte;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioContribuintes.entidades.PessoaFisica;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioContribuintes.entidades.PessoaJuridica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<Contribuinte> contribuintes = new ArrayList<>();

        System.out.print("Informe a quantidade de contribuintes: ");
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("Contribuinte #%d ", i + 1);
            System.out.print("Pessoa fisica ou juridica? (f/j): ");
            char tipoPessoa = in.readLine().charAt(0);
            System.out.print("Nome:");
            String nome = in.readLine();
            System.out.print("Rendimento anual: ");
            double rendimentoAnual = Double.parseDouble(in.readLine());
            if (tipoPessoa == 'f' || tipoPessoa == 'F'){
                System.out.print("Gastos com despesas medicas: ");
                double despesasMedicas = Double.parseDouble(in.readLine());
                contribuintes.add(new PessoaFisica(nome,rendimentoAnual,despesasMedicas));
            } else if (tipoPessoa == 'j' || tipoPessoa == 'J' ) {
                System.out.print("Numeros de funcionarios: ");
                int numeroDeFuncionarios = Integer.parseInt(in.readLine());
                contribuintes.add(new PessoaJuridica(nome,rendimentoAnual,numeroDeFuncionarios));
            }
        }

        double soma = 0.0;
        System.out.println("Taxas pagas:");
        for (Contribuinte cont : contribuintes){
            double taxa = cont.taxa();
            System.out.println(cont.getNome() + ": " + String.format("%.2f",taxa) );
            soma += taxa;
        }

        System.out.println();
        System.out.println("Total de taxas: R$ " + String.format("%.2f",soma));

    }
}
