package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.services;

public class TaxadeServicoBrasil implements TaxadeServico {

    @Override
    public double taxa(double valor) {
        if (valor <= 100) {
            return valor * 0.2;
        } else {
            return valor * 0.15;
        }
    }
}
