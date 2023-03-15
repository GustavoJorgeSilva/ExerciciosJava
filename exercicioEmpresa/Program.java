package com.udemy.cursojavacompletonelioalves.exercicios.exercicioEmpresa;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioEmpresa.entidades.Funcionario;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioEmpresa.entidades.FuncionarioTerceirizado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Informe o numero de funcionarios: ");
        int n = Integer.parseInt(in.readLine());
        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados do funcionario #%d \n", i + 1);
            System.out.print("O funcionario e terceirizado? (S/N) ");
            char ehterceirzado = in.readLine().charAt(0);
            System.out.print("Nome: ");
            String nome = in.readLine();
            System.out.print("Horas trabalhadas: ");
            int horasTrabalhadas = Integer.parseInt(in.readLine());
            System.out.print("Valor hora: ");
            double valorHora = Double.parseDouble(in.readLine());
            if (ehterceirzado == 's' || ehterceirzado == 'S') {
                System.out.print("Custo adicional: ");
                double custoAdicional = Double.parseDouble(in.readLine());
                funcionarios.add(new FuncionarioTerceirizado(nome, horasTrabalhadas, valorHora, custoAdicional));
            } else {
                funcionarios.add(new Funcionario(nome, horasTrabalhadas, valorHora));
            }
        }

        System.out.println();
        System.out.println("PAGAMENTOS: ");
        for (Funcionario func : funcionarios) {
            System.out.println(func);
        }
    }
}
