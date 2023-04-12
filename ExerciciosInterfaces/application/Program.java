package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.application;

import com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.entidades.AluguelCarro;
import com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.entidades.Veiculo;
import com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.services.ServicoDeAluguel;
import com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.services.TaxadeServicoBrasil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String modeloCarro = leitor.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime retirada = LocalDateTime.parse(leitor.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime retorno = LocalDateTime.parse(leitor.nextLine(), fmt);

        AluguelCarro aluguelCarro = new AluguelCarro(retirada, retorno, new Veiculo(modeloCarro));

        System.out.print("Informe o preço por hora: ");
        double precoHora = leitor.nextDouble();
        System.out.print("Informe o preço por dia: ");
        double precoDia = leitor.nextDouble();

        ServicoDeAluguel service = new ServicoDeAluguel(precoHora, precoDia, new TaxadeServicoBrasil());

        service.processarFatura(aluguelCarro);

        System.out.println("Fatura: ");
        System.out.printf("Pagamento basico: %.2f\n", aluguelCarro.getFatura().getPagamentoBasico());
        System.out.printf("Imposto: %.2f\n", aluguelCarro.getFatura().getImposto());
        System.out.printf("Pagamento total: %.2f\n", aluguelCarro.getFatura().getPagamentoTotal());


    }
}
