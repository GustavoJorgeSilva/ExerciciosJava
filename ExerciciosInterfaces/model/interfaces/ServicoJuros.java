package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.interfaces;

import java.security.InvalidParameterException;

public interface ServicoJuros {

    public double getTaxaDeJuros();
    default double pagamento(Double valor,int meses){
        if (meses < 1) {
            throw new InvalidParameterException("Meses deve ser maior que 0");
        }
        return valor * Math.pow((1 + getTaxaDeJuros() / 100), meses);

    }
}
