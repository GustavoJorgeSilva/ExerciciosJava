package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosList;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.Funcionario_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Exercicio2_Salario {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Quantos funcionarios deseja registrar? ");
        int n = Integer.parseInt(in.readLine());
        int id = 0;
        int idAumento = 0;
        double porcentagem = 0;


        List<Funcionario_2> funcionarios = new ArrayList<>();
        Funcionario_2 funcionario = null;

        for (int i = 0; i < n; i++) {
            System.out.printf("Funcionario #%d\n", i + 1);
            System.out.print("Id: ");
            id = Integer.parseInt(in.readLine());
            System.out.print("Nome: ");
            String nome = in.readLine();
            System.out.print("Salario: ");
            double salario = Double.parseDouble(in.readLine());

            funcionarios.add(funcionario = new Funcionario_2(id, nome, salario));

        }


        System.out.println("Informe o Id do funcionario que voce deseja aumentar o salario");
        System.out.print("Id: ");
        idAumento = Integer.parseInt(in.readLine());

        for (Funcionario_2 f : funcionarios) {
            if (Objects.equals(f.getId(), idAumento)) {
                funcionario = f;
                System.out.print("Porcentagem: ");
                porcentagem = Double.parseDouble(in.readLine());
                break;
            }
        }

        if (!Objects.equals(funcionario.getId(), idAumento)) {
            System.out.println("ID invalido");
        }

        if (funcionario != null) {
            funcionario.aumentoSalario(porcentagem);
        }


        System.out.println("Lista de Funcionarios: ");
        for (Funcionario_2 x : funcionarios) {
            System.out.println(x);
        }


    }
}
