package com.udemy.cursojavacompletonelioalves.exercicios.exercicio_funcionario;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.ContratoHoras;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.Departamento;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.FuncionarioTech;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.enums.Hierarquia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Program {
    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Informe o nome nome do departamento: ");
        String departamento = in.readLine();
        System.out.println("Informe os dados do funcionario: ");
        System.out.print("Nome: ");
        String nome = in.readLine();
        System.out.println("Hierarquia: ");
        System.out.print("1- JUNIOR  2- PLENO  3- SENIOR  :");
        String nivel = in.readLine();
        System.out.print("Salario base: ");
        double salariobase = Double.parseDouble(in.readLine());
        FuncionarioTech funcionario = new FuncionarioTech(nome,Hierarquia.valueOf(nivel.toUpperCase()),salariobase, new Departamento(departamento));

        System.out.print("Quantos contratos o funcionario possui? ");
        int quantidadeContratos = Integer.parseInt(in.readLine());

        for (int i = 0; i < quantidadeContratos; i++) {
            System.out.printf("Contrato #%d\n", i + 1);
            System.out.print("Data: (DD/MM/YYYY): ");
            Date dataContrato = dateFormat.parse(in.readLine());
            System.out.print("Valor por hora: ");
            double valorHora = Double.parseDouble(in.readLine());
            System.out.print("Duracao (horas): ");
            int horasTrabalhadas = Integer.parseInt(in.readLine());
            ContratoHoras contrato = new ContratoHoras(dataContrato,valorHora,horasTrabalhadas);
            funcionario.adicionarContrato(contrato);
        }

        System.out.println();

        System.out.print("Informe o mes e o ano para calculo de rendimento (MM/YYYY): ");
        String mesEAno = in.readLine();
        int mes = Integer.parseInt(mesEAno.substring(0,2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
        System.out.println("Rendimento de "+ mesEAno + String.format(" %.2f\n", funcionario.income(ano,mes)));






    }
}
