package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.services;

import com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.entidades.AluguelCarro;
import com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.entidades.Fatura;

public class ServicoDeAluguel {

    private Double precoPorHora;
    private Double precoPorDia;

    private TaxaDeServicoBrasil taxaDeServicoBrasil;

    public ServicoDeAluguel(Double precoPorHora, Double precoPorDia, TaxaDeServicoBrasil taxaDeServicoBrasil) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxaDeServicoBrasil = taxaDeServicoBrasil;
    }

    public void processarFatura(AluguelCarro aluguelCarro){

        aluguelCarro.setFatura(new Fatura(50.0,10.0));

    }
}
