package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.services;

import com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.entidades.AluguelCarro;
import com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.entidades.Fatura;

import java.time.Duration;

public class ServicoDeAluguel {

    private Double precoPorHora;
    private Double precoPorDia;

    private TaxadeServico taxaDeServico;

    public ServicoDeAluguel(Double precoPorHora, Double precoPorDia, TaxadeServico taxaDeServico) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxaDeServico = taxaDeServico;
    }

    public void processarFatura(AluguelCarro aluguelCarro) {

        double minutos = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim()).toMinutes();
        double horas = minutos / 60.0;

        double pagamentoBasico;
        if (horas <= 12) {
            pagamentoBasico = precoPorHora * Math.ceil(horas);
        } else {
            pagamentoBasico = precoPorDia * Math.ceil(horas / 24);
        }

        double imposto = taxaDeServico.taxa(pagamentoBasico);

        aluguelCarro.setFatura(new Fatura(pagamentoBasico, imposto));

    }
}
