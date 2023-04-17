package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.entidades;

import com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.interfaces.ServicoJuros;

import java.security.InvalidParameterException;

public class TaxaDeJurosUsa implements ServicoJuros {

    private double taxaDeJuros;

    public TaxaDeJurosUsa(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
    @Override
    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }


}
