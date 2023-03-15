package com.udemy.cursojavacompletonelioalves.exercicios.exercicioContribuintes.entidades;

public class PessoaFisica extends Contribuinte {

    private Double gastosMedicos;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosMedicos) {
        super(nome, rendaAnual);
        this.gastosMedicos = gastosMedicos;
    }

    public Double getGastosMedicos() {
        return gastosMedicos;
    }

    public void setGastosMedicos(Double gastosMedicos) {
        this.gastosMedicos = gastosMedicos;
    }

    @Override
    public Double taxa() {
        double taxa = 0.0;
        if (getRendaAnual() < 20000.0) {
           return getRendaAnual() * 0.15 - gastosMedicos * 0.5;
        }
        else {
            return getRendaAnual() * 0.25 - getGastosMedicos() * 0.5;
        }

    }
}
