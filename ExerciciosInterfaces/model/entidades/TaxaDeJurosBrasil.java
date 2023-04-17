package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.entidades;

import com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.interfaces.ServicoJuros;

import java.security.InvalidParameterException;

public class TaxaDeJurosBrasil implements ServicoJuros {

    private double taxaDeJuros;

    public TaxaDeJurosBrasil(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
    @Override
    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    
}
